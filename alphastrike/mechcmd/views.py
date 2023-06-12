from django.shortcuts import render, redirect
from django.http import HttpResponse
from .models import Mech
from .forms import MechForm
from django.http import HttpResponseRedirect
from django.db.models import Q

def home_view(request):
    return render(request, "home.html")

#Mech Views
def agt1a_view(request):
    mech_list = Mech.objects.filter(Q(Name='Agrotera', MechModel='AGT-1A'))
    return render(request, "ViewCard.html",{'mech_list':mech_list})

def aku1x_view(request):
    mech_list = Mech.objects.filter(Q(Name='Akuma', MechModel='AKU-1X'))
    return render(request, "ViewCard.html",{'mech_list':mech_list})

def alb3u_view(request):
    mech_list = Mech.objects.filter(Q(Name='Albatross', MechModel='ALB-3U'))
    return render(request, "ViewCard.html",{'mech_list':mech_list})

def amk1_view(request):
    mech_list = Mech.objects.filter(Q(Name='Amarok', MechModel='1'))
    return render(request, "ViewCard.html",{'mech_list':mech_list})

def anh1a_view(request):
    mech_list = Mech.objects.filter(Q(Name='Annihilator', MechModel='ANH-1A'))
    return render(request, "ViewCard.html",{'mech_list':mech_list})

def abs3l_view(request):
    mech_list = Mech.objects.filter(Q(Name='Anubis', MechModel='ABS-3L'))
    return render(request, "ViewCard.html",{'mech_list':mech_list})

def anv3m_view(request):
    mech_list = Mech.objects.filter(Q(Name='Anvil', MechModel='ANV-3M'))
    return render(request, "ViewCard.html",{'mech_list':mech_list})

def bnc1e_view(request):
    mech_list = Mech.objects.filter(Q(Name='Banshee', MechModel='BNC-1E'))
    return render(request, "ViewCard.html",{'mech_list':mech_list})

def zeu5s_view(request):
    mech_list = Mech.objects.filter(Q(Name='Zeus', MechModel='ZEU-5S'))
    return render(request, "ViewCard.html",{'mech_list':mech_list})
#End Mech Views

def contact_view(request):
    return render(request, 'contact.html')

def about_view(request):
    return render(request, 'about.html')

def allmechs_view(request):
    mech_list = Mech.objects.all()
    return render(request, 'allmechs.html',{'mech_list': mech_list} )

def addmech_view(request):
    submitted = False
    if request.method == 'POST':
        form = MechForm(request.POST, request.FILES)
        if form.is_valid():
            form.save()
            return HttpResponseRedirect('/images?submitted=True')
    else:
        form = MechForm
        if 'submitted' in request.GET:
            submitted = True
    return render(request, 'addmech.html', {'form':form, 'submitted':submitted})

def search_mechs_view(request):
    if request.method == 'POST':
        searched = request.POST['searched']
        mechs = Mech.objects.filter(Name__contains=searched)
        return render(request, 'search_mechs.html', {'searched':searched, 'mechs':mechs})
        