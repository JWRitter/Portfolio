from django.contrib import admin
from .models import Mech

# Register database tabels here
#admin.site.register(Mech)

@admin.register(Mech)
class MechAdmin(admin.ModelAdmin):
    list_display = ('Name', 'MechModel', 'Size')
    ordering = ('Name',)
    search_fields = ('Name', 'MechModel',)