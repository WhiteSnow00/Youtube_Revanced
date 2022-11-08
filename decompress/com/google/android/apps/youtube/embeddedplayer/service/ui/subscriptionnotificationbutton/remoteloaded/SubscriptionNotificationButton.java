// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded;

import java.util.List;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuItem;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationMenuData;
import com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.model.SubscriptionNotificationButtonData;
import com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b;
import android.view.View$OnClickListener;
import com.google.android.libraries.youtube.common.ui.TouchImageView;

public class SubscriptionNotificationButton extends TouchImageView implements View$OnClickListener
{
    public h a;
    public c b;
    public f c;
    public b d;
    public SubscriptionNotificationButtonData e;
    public SubscriptionNotificationMenuData f;
    
    public SubscriptionNotificationButton(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = h.a;
        this.b = com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.c.w;
        this.c = com.google.android.apps.youtube.embeddedplayer.service.ui.subscriptionnotificationbutton.remoteloaded.f.h;
        this.d = com.google.android.apps.youtube.embeddedplayer.service.interactionlogging.remoteloaded.b.a;
        this.e = SubscriptionNotificationButtonData.a;
        this.f = SubscriptionNotificationMenuData.a;
    }
    
    public final void onClick(final View view) {
        if (!this.f.equals((Object)SubscriptionNotificationMenuData.a)) {
            this.d.b(this.e.c().I());
            this.a.a(this.f, this.e.b(), (View)this, (akn)new bs(this, 8));
            final afcr b = this.f.b;
            for (int size = ((List)b).size(), i = 0; i < size; ++i) {
                this.d.d(((SubscriptionNotificationMenuItem)((List)b).get(i)).c().I());
            }
        }
    }
}
