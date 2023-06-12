"""alphastrike URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/4.1/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""
from django.contrib import admin
from django.urls import path
from mechcmd import views
from django.conf import settings
from django.conf.urls.static import static


urlpatterns = [
    path("admin/", admin.site.urls)                                 ,
    path('', views.home_view, name='home')                          ,
    path('contact/', views.contact_view, name='contact')            ,
    path('about/', views.about_view, name='about')                  ,
    #mech paths
    path('aku-1x/', views.aku1x_view, name='akuma-1x')              ,
    path('alb-3u/', views.alb3u_view, name='albatross-3u')          ,
    path('amk-1/', views.amk1_view, name='amarok-1')                ,
    path('agt-1a/', views.agt1a_view, name='agrotera-1a')           ,
    path('anh-1a/', views.anh1a_view, name='annihilator-1a')        ,
    path('abs-3l/', views.abs3l_view, name='anubis-3l')             ,
    path('anv-3m/', views.anv3m_view, name='anvil-2m')              ,
    path('bnc-1e/', views.bnc1e_view, name='banshee-1e')            ,
    path('zeu-5s/', views.zeu5s_view, name='zeus-5s')               ,
    #end mech paths
    path('mech/', views.allmechs_view, name='mechs')                ,
    path('search_mechs/', views.search_mechs_view, name='search')   ,
    
    path('addmech/', views.addmech_view, name='add-mech')           ,
] + static(settings.MEDIA_URL, document_root=settings.MEDIA_ROOT)

