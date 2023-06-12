from django.db import models

# Create your models here.
class Mech(models.Model):
    Name = models.CharField(max_length=100)
    MechModel = models.CharField(max_length=100, default='')
    Roll = models.CharField(max_length=100)
    Pointcost = models.IntegerField(null=True)
    Size = models.IntegerField(null=True)
    Armor = models.IntegerField(null=True)
    Structure = models.IntegerField(null=True)
    EraStarLeague = models.BooleanField(default=False)
    EraSuccession = models.BooleanField(default=False)
    EraClanInvasion = models.BooleanField(default=False)
    EraFedCom = models.BooleanField(default=False)
    EraDarkAge = models.BooleanField(default=False)
    EraIlClan = models.BooleanField(default=False)
    MechURL = models.CharField(max_length=500, null=True)
    ImageMech = models.ImageField(null=True, blank=True, upload_to='images/')
    #MechImage = models.URLField(max_length=500, default="https://t3.ftcdn.net/jpg/03/45/05/92/360_F_345059232_CPieT8RIWOUk4JqBkkWkIETYAkmz2b75.jpg")
    def __str__(self):
        return (self.Name+' '+self.MechModel)
