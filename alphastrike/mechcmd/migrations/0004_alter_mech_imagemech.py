# Generated by Django 4.1.5 on 2023-05-16 20:35

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ("mechcmd", "0003_mech_mechmodel"),
    ]

    operations = [
        migrations.AlterField(
            model_name="mech",
            name="ImageMech",
            field=models.ImageField(blank=True, null=True, upload_to="images/"),
        ),
    ]
