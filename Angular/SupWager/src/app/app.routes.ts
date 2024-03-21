import { Routes } from '@angular/router';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { AdminComponent } from './admin/admin.component';
import { UserComponent } from './user/user.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';

export const routes: Routes = [
    {'path':"", component:LandingPageComponent},
    {'path':"admin-login", component: AdminComponent},
    {'path':"user-login", component:UserComponent},
    {'path': 'about', component:AboutComponent},
    {'path': 'contact', component:ContactComponent}
];
