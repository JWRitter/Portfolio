from django import forms
from django.forms import ModelForm
from .models import Mech

class MechForm(ModelForm):
    class Meta:
        model = Mech
        fields = ('Name', 'MechModel', 'Roll', 'Pointcost', 'Size', 'Armor', 'Structure', 'EraStarLeague', 'EraSuccession','EraClanInvasion', 'EraFedCom', 'EraDarkAge', 'EraIlClan', 'ImageMech', 'MechURL')
        labels = {
            'Name': 'Mech Name',
            'MechModel': 'Mech Model',
            'Role': 'Battlefield Role',
            'Pointcost' :'Point Value',
            'Size': 'Mech Size',
            'Armor': 'Armor',
            'Structure': 'Structure',
            'EraStarLeague' : 'Star League Era', 
            'EraSuccession' : 'Succession Wars Era',
            'EraClanInvasion' : 'Clan Invasion Era', 
            'EraFedCom' : 'FedCom Civil War', 
            'EraDarkAge': 'Dark Age Era', 
            'EraIlClan' : 'IlClan Era', 
            'ImageMech' : 'Mech Image',
            'MechURL' : 'Mech URL',
        }
        widgets = {
            'Name': forms.TextInput(attrs={'class':'form-control'}),
            'MechModel': forms.TextInput(attrs={'class':'form-control'}),
            'Roll': forms.TextInput(attrs={'class':'form-control'}),
            'Pointcost' : forms.TextInput(attrs={'class':'form-control'}),
            'Size': forms.TextInput(attrs={'class':'form-control'}),
            'Armor': forms.TextInput(attrs={'class':'form-control'}),
            'Structure': forms.TextInput(attrs={'class':'form-control'}),
        }
