// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.youtube.app.common.ui.navigation;

import java.lang.reflect.InvocationTargetException;
import j$.util.Optional;
import java.util.Collection;
import java.util.ArrayList;
import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class PaneDescriptor implements Parcelable
{
    public static final Parcelable$Creator CREATOR;
    private static final afeq e;
    public final Class a;
    public final Bundle b;
    public final boolean c;
    public aezs d;
    
    static {
        e = afeq.s((Object)"TIKTOK_FRAGMENT_ACCOUNT_ID", (Object)"TIKTOK_FRAGMENT_NO_ACCOUNT_ONLY");
        CREATOR = (Parcelable$Creator)new fzn(6);
    }
    
    public PaneDescriptor(final Parcel parcel) {
        try {
            this.a = Class.forName(parcel.readString());
            final int int1 = parcel.readInt();
            boolean c = true;
            if (int1 != 1) {
                c = false;
            }
            this.c = c;
            final ClassLoader classLoader = this.getClass().getClassLoader();
            final Bundle b = (Bundle)parcel.readParcelable(classLoader);
            this.b = b;
            if (b != null) {
                b.setClassLoader(classLoader);
            }
        }
        catch (final ClassNotFoundException ex) {
            throw new IllegalArgumentException("Failed to read fragmentClass.");
        }
    }
    
    public PaneDescriptor(final Class clazz, final Bundle bundle) {
        this(clazz, bundle, false);
    }
    
    public PaneDescriptor(final Class a, final Bundle b, final boolean c) {
        a.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static Bundle a() {
        return new Bundle();
    }
    
    public static PaneDescriptor b(final ggq ggq) {
        Bundle m;
        if ((m = ((br)ggq).m) == null) {
            m = new Bundle();
        }
        return new PaneDescriptor(ggq.getClass(), m);
    }
    
    public static PaneDescriptor c(final Class clazz, final aiqj aiqj, final Bundle bundle) {
        return d(clazz, aiqj, bundle, false);
    }
    
    public static PaneDescriptor d(final Class clazz, final aiqj aiqj, final Bundle bundle, final boolean b) {
        aiqj.getClass();
        final PaneDescriptor paneDescriptor = new PaneDescriptor(clazz, bundle, b);
        paneDescriptor.l(aiqj);
        return paneDescriptor;
    }
    
    public static aezs e() {
        return (aezs)new ggo();
    }
    
    public static aiqj g(final Bundle bundle) {
        return vdb.c(bundle.getByteArray("navigation_endpoint"));
    }
    
    public static boolean q(final PaneDescriptor paneDescriptor, final PaneDescriptor paneDescriptor2, final aeea aeea) {
        return r(paneDescriptor, paneDescriptor2, aeea, false);
    }
    
    public static boolean r(final PaneDescriptor paneDescriptor, final PaneDescriptor paneDescriptor2, final aeea aeea, final boolean b) {
        if (paneDescriptor == paneDescriptor2) {
            return true;
        }
        if (paneDescriptor != null) {
            if (paneDescriptor2 != null) {
                if (paneDescriptor.a == paneDescriptor2.a && tpe.cF(t(paneDescriptor.b, b), t(paneDescriptor2.b, b))) {
                    final Bundle b2 = paneDescriptor.b;
                    final Bundle b3 = paneDescriptor2.b;
                    final boolean containsKey = b2.containsKey("navigation_endpoint");
                    final boolean containsKey2 = b3.containsKey("navigation_endpoint");
                    if (containsKey == containsKey2) {
                        if ((!containsKey && !containsKey2) || aeea.cg(g(b2), g(b3))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public static boolean s(final PaneDescriptor paneDescriptor, final PaneDescriptor paneDescriptor2, final aeea aeea) {
        return r(paneDescriptor, paneDescriptor2, aeea, true);
    }
    
    private static Bundle t(final Bundle bundle, final boolean b) {
        final ArrayList list = new ArrayList();
        list.addAll((Collection)few.a);
        if (b) {
            list.addAll((Collection)PaneDescriptor.e);
        }
        final int size = list.size();
        Bundle bundle2 = null;
        for (int i = 0; i < size; ++i) {
            final String s = (String)list.get(i);
            if (bundle.containsKey(s)) {
                Bundle bundle3;
                if ((bundle3 = bundle2) == null) {
                    bundle3 = new Bundle(bundle);
                }
                bundle3.remove(s);
                bundle2 = bundle3;
            }
        }
        if (bundle2 != null) {
            return bundle2;
        }
        return bundle;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final aiqj f() {
        return g(this.b);
    }
    
    public final Optional h() {
        Object o = null;
        Label_0095: {
            try {
                o = this.a.getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                break Label_0095;
            }
            catch (final InvocationTargetException o) {}
            catch (final NoSuchMethodException o) {}
            catch (final IllegalAccessException o) {}
            catch (final InstantiationException ex) {}
            final zll a = zll.a;
            final zlk y = zlk.y;
            final String name = this.a.getName();
            final StringBuilder sb = new StringBuilder("[PaneDescriptor][Android]Could not create a PaneFragment from ");
            sb.append(name);
            sb.append(" class constructor.");
            zlm.c(a, y, sb.toString(), (Throwable)o);
            o = null;
        }
        if (o != null) {
            ((br)o).ag(new Bundle(this.b));
        }
        return Optional.ofNullable(o);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    public final String i(final String s) {
        return this.b.getString(s);
    }
    
    public final void j(final ClassLoader classLoader) {
        this.b.setClassLoader(classLoader);
    }
    
    public final void k(final boolean b) {
        this.b.putBoolean("maximize_watch_when_entering", b);
    }
    
    public final void l(final aiqj aiqj) {
        this.b.putByteArray("navigation_endpoint", ((agzk)aiqj).toByteArray());
    }
    
    public final void m(final amqg amqg) {
        this.b.putByteArray("navigation_endpoint_interaction_logging_extension", ((agzk)amqg).toByteArray());
    }
    
    public final boolean n() {
        return this.b.getBoolean("maximize_watch_when_entering", false);
    }
    
    public final boolean o() {
        return this.b.getBoolean("pivot", false);
    }
    
    public final void p(final boolean b) {
        this.b.putBoolean("split_pane_library_opened_in_offline_mode", b);
    }
    
    @Override
    public final String toString() {
        final String simpleName = this.a.getSimpleName();
        final String string = super.toString();
        final StringBuilder sb = new StringBuilder("PaneDescriptor for ");
        sb.append(simpleName);
        sb.append("(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a.getName());
        parcel.writeInt((int)(this.c ? 1 : 0));
        parcel.writeParcelable((Parcelable)this.b, n);
    }
}
