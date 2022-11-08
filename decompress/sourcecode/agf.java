import java.util.Set;
import java.util.Iterator;
import android.app.Notification$Action$Builder;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;
import android.app.Notification;
import android.app.Notification$BubbleMetadata;
import android.net.Uri;
import android.text.TextUtils;
import android.os.Parcelable;
import java.util.Collection;
import android.os.Build$VERSION;
import android.app.RemoteInput;
import android.app.PendingIntent;
import android.widget.RemoteViews;
import java.util.ArrayList;
import android.os.Bundle;
import android.app.Notification$Builder;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agf implements afg
{
    public final Context a;
    public final Notification$Builder b;
    public final afp c;
    private final Bundle d;
    
    public agf(final afp c) {
        new ArrayList();
        this.d = new Bundle();
        this.c = c;
        this.a = c.a;
        final Notification$Builder a = agb.a(c.a, c.D);
        this.b = a;
        final Notification h = c.H;
        a.setWhen(h.when).setSmallIcon(h.icon, h.iconLevel).setContent(h.contentView).setTicker(h.tickerText, (RemoteViews)null).setVibrate(h.vibrate).setLights(h.ledARGB, h.ledOnMS, h.ledOffMS).setOngoing((h.flags & 0x2) != 0x0).setOnlyAlertOnce((h.flags & 0x8) != 0x0).setAutoCancel((h.flags & 0x10) != 0x0).setDefaults(h.defaults).setContentTitle(c.e).setContentText(c.f).setContentInfo(c.i).setContentIntent(c.g).setDeleteIntent(h.deleteIntent).setFullScreenIntent((PendingIntent)null, (h.flags & 0x80) != 0x0).setLargeIcon(c.h).setNumber(c.j).setProgress(c.p, c.q, c.r);
        afu.a(afu.c(afu.b(a, c.n), false), c.k);
        final ArrayList b = c.b;
        final int size = b.size();
        int n = 0;
        String s;
        while (true) {
            s = "android.support.allowGeneratedReplies";
            if (n >= size) {
                break;
            }
            final afh afh = (afh)b.get(n);
            final IconCompat a2 = afh.a();
            Icon b2;
            if (a2 != null) {
                b2 = air.b(a2, (Context)null);
            }
            else {
                b2 = null;
            }
            final Notification$Action$Builder a3 = afz.a(b2, afh.f, afh.g);
            final agp[] b3 = afh.b;
            if (b3 != null) {
                final int length = b3.length;
                final RemoteInput[] array = new RemoteInput[length];
                for (int i = 0; i < b3.length; ++i) {
                    array[i] = agm.a(b3[i]);
                }
                for (int j = 0; j < length; ++j) {
                    afx.b(a3, array[j]);
                }
            }
            final Bundle bundle = new Bundle(afh.a);
            bundle.putBoolean("android.support.allowGeneratedReplies", afh.c);
            aga.a(a3, afh.c);
            bundle.putInt("android.support.action.semanticAction", 0);
            if (Build$VERSION.SDK_INT >= 28) {
                agc.a(a3, 0);
            }
            if (Build$VERSION.SDK_INT >= 29) {
                agd.a(a3, false);
            }
            if (Build$VERSION.SDK_INT >= 31) {
                age.a(a3, false);
            }
            bundle.putBoolean("android.support.action.showsUserInterface", afh.d);
            afx.a(a3, bundle);
            afx.e(this.b, afx.d(a3));
            ++n;
        }
        final Bundle x = c.x;
        if (x != null) {
            this.d.putAll(x);
        }
        afv.a(this.b, c.l);
        afx.h(this.b, c.v);
        afx.f(this.b, c.s);
        afx.i(this.b, c.u);
        afx.g(this.b, c.t);
        afy.b(this.b, c.w);
        afy.c(this.b, c.y);
        afy.f(this.b, c.z);
        afy.d(this.b, c.A);
        afy.e(this.b, h.sound, h.audioAttributes);
        ArrayList l;
        if (Build$VERSION.SDK_INT < 28) {
            final ArrayList c2 = c.c;
            ArrayList list;
            if (c2 == null) {
                list = null;
            }
            else {
                list = new ArrayList(c2.size());
                final Iterator iterator = c2.iterator();
                if (iterator.hasNext()) {
                    final tb tb = (tb)iterator.next();
                    throw null;
                }
            }
            final ArrayList k = c.I;
            if (list == null) {
                l = k;
            }
            else {
                l = list;
                if (k != null) {
                    final abi abi = new abi(list.size() + k.size());
                    abi.addAll((Collection)list);
                    abi.addAll((Collection)k);
                    l = new ArrayList((Collection<? extends E>)abi);
                }
            }
        }
        else {
            l = c.I;
        }
        if (l != null && !l.isEmpty()) {
            final Iterator iterator2 = l.iterator();
            while (iterator2.hasNext()) {
                afy.a(this.b, (String)iterator2.next());
            }
        }
        if (c.d.size() > 0) {
            Bundle bundle2;
            if ((bundle2 = c.b().getBundle("android.car.EXTENSIONS")) == null) {
                bundle2 = new Bundle();
            }
            final Bundle bundle3 = new Bundle(bundle2);
            final Bundle bundle4 = new Bundle();
            int n2 = 0;
            final String s2 = s;
            while (n2 < c.d.size()) {
                final String string = Integer.toString(n2);
                final afh afh2 = c.d.get(n2);
                final Bundle bundle5 = new Bundle();
                final IconCompat a4 = afh2.a();
                int a5;
                if (a4 != null) {
                    a5 = a4.a();
                }
                else {
                    a5 = 0;
                }
                bundle5.putInt("icon", a5);
                bundle5.putCharSequence("title", afh2.f);
                bundle5.putParcelable("actionIntent", (Parcelable)afh2.g);
                final Bundle bundle6 = new Bundle(afh2.a);
                bundle6.putBoolean(s2, afh2.c);
                bundle5.putBundle("extras", bundle6);
                final agp[] b4 = afh2.b;
                Object[] array2;
                if (b4 == null) {
                    array2 = null;
                }
                else {
                    final Bundle[] array3 = new Bundle[b4.length];
                    for (int n3 = 0; n3 < b4.length; ++n3) {
                        final agp agp = b4[n3];
                        final Bundle bundle7 = new Bundle();
                        bundle7.putString("resultKey", (String)agp.e);
                        bundle7.putCharSequence("label", (CharSequence)agp.b);
                        bundle7.putCharSequenceArray("choices", (CharSequence[])null);
                        final boolean a6 = agp.a;
                        bundle7.putBoolean("allowFreeFormInput", true);
                        bundle7.putBundle("extras", (Bundle)agp.c);
                        final Object d = agp.d;
                        if (!((Set)d).isEmpty()) {
                            final ArrayList list2 = new ArrayList<String>(((Set)d).size());
                            final Iterator iterator3 = ((Set)d).iterator();
                            while (iterator3.hasNext()) {
                                list2.add((String)iterator3.next());
                            }
                            bundle7.putStringArrayList("allowedDataTypes", list2);
                        }
                        array3[n3] = bundle7;
                    }
                    array2 = array3;
                }
                bundle5.putParcelableArray("remoteInputs", (Parcelable[])array2);
                bundle5.putBoolean("showsUserInterface", afh2.d);
                bundle5.putInt("semanticAction", 0);
                bundle4.putBundle(string, bundle5);
                ++n2;
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            c.b().putBundle("android.car.EXTENSIONS", bundle2);
            this.d.putBundle("android.car.EXTENSIONS", bundle3);
        }
        afw.a(this.b, c.x);
        aga.e(this.b, c.o);
        final RemoteViews b5 = c.B;
        if (b5 != null) {
            aga.c(this.b, b5);
        }
        final RemoteViews c3 = c.C;
        if (c3 != null) {
            aga.b(this.b, c3);
        }
        agb.b(this.b, 0);
        agb.e(this.b, (CharSequence)null);
        agb.f(this.b, (String)null);
        agb.g(this.b, c.E);
        agb.d(this.b, c.F);
        if (!TextUtils.isEmpty((CharSequence)c.D)) {
            this.b.setSound((Uri)null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[])null);
        }
        if (Build$VERSION.SDK_INT >= 28) {
            final ArrayList c4 = c.c;
            if (c4.size() > 0) {
                final tb tb2 = (tb)c4.get(0);
                throw null;
            }
        }
        if (Build$VERSION.SDK_INT >= 29) {
            agd.b(this.b, c.G);
            agd.c(this.b, (Notification$BubbleMetadata)null);
        }
    }
}
