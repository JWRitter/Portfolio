# Generated by Django 4.1.5 on 2023-05-29 20:34

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ("mechcmd", "0006_remove_mech_skill"),
    ]

    operations = [
        migrations.AddField(
            model_name="mech",
            name="MechURL",
            field=models.CharField(max_length=500, null=True),
        ),
    ]
