import android.content.res.TypedArray;
import java.util.Map;
import android.view.View;
import java.util.Iterator;
import android.util.AttributeSet;
import android.graphics.Typeface;
import java.io.IOException;
import java.io.File;
import android.view.Choreographer$FrameCallback;
import android.os.Parcelable$Creator;
import android.os.RemoteException;
import android.os.Parcelable;
import android.os.Parcel;
import android.net.Uri;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics$Key;
import android.os.Looper;
import android.view.Choreographer;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import android.os.Handler;
import android.content.ComponentName;
import android.widget.TextView;
import android.text.Editable$Factory;
import android.text.TextWatcher;
import android.widget.EditText;
import android.view.animation.Animation;
import android.os.Build$VERSION;
import java.util.HashMap;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Bundle;
import android.content.Intent;
import android.animation.Animator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kg
{
    public final Object a;
    public final Object b;
    
    public kg() {
        this.b = new abn();
        this.a = new abk();
    }
    
    public kg(final int n, final int n2) {
        this.a = new int[] { n, n2 };
        this.b = new float[] { 0.0f, 1.0f };
    }
    
    public kg(final int n, final int n2, final int n3) {
        this.a = new int[] { n, n2, n3 };
        this.b = new float[] { 0.0f, 0.5f, 1.0f };
    }
    
    public kg(final aejr b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        final aux a = new aux();
        this.a = a;
        final yb a2 = yb.a(5);
        final aux aux = a;
        a.k((Object)a2);
    }
    
    public kg(final Animator b) {
        this.a = null;
        this.b = b;
    }
    
    public kg(final Intent b, final Bundle a) {
        this.b = b;
        this.a = a;
    }
    
    public kg(final CameraCharacteristics cameraCharacteristics) {
        this.a = new HashMap();
        bx b;
        if (Build$VERSION.SDK_INT >= 28) {
            b = new bx(cameraCharacteristics);
        }
        else {
            b = new bx(cameraCharacteristics);
        }
        this.b = b;
    }
    
    public kg(final Animation a) {
        this.a = a;
        this.b = null;
    }
    
    public kg(final EditText b) {
        this((byte[])null);
        this.b = b;
        final EditText editText = b;
        b.addTextChangedListener((TextWatcher)(this.a = new asv(b)));
        final Editable$Factory a = asq.a();
        final EditText editText2 = b;
        b.setEditableFactory(a);
    }
    
    public kg(final EditText b, final byte[] array) {
        this((byte[])null);
        this.b = b;
        final EditText editText = b;
        b.addTextChangedListener((TextWatcher)(this.a = new asi(b)));
        final Editable$Factory a = asb.a();
        final EditText editText2 = b;
        b.setEditableFactory(a);
    }
    
    public kg(final TextView a) {
        this.a = a;
        this.b = new avt(a);
    }
    
    public kg(final aq a, final ComponentName b) {
        this.a = a;
        this.b = b;
    }
    
    public kg(final bx b, final Handler a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public kg(final cl b) {
        this.a = new CopyOnWriteArrayList();
        this.b = b;
    }
    
    public kg(final Class b, final atml a) {
        this.b = b;
        this.a = a;
    }
    
    public kg(final String b) {
        this.a = new HashMap();
        this.b = b;
    }
    
    public kg(final List list, final List list2) {
        final int size = list.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; ++i) {
            ((int[])this.a)[i] = (int)list.get(i);
            ((float[])this.b)[i] = (float)list2.get(i);
        }
    }
    
    public kg(final byte[] array) {
    }
    
    public kg(final byte[] array, final byte[] array2) {
        this.a = Choreographer.getInstance();
        this.b = Looper.myLooper();
    }
    
    public final Object A(final CameraCharacteristics$Key cameraCharacteristics$Key) {
        if (cameraCharacteristics$Key.equals((Object)CameraCharacteristics.SENSOR_ORIENTATION)) {
            return ((bx)this.b).j(cameraCharacteristics$Key);
        }
        synchronized (this) {
            final Object value = ((Map<K, Object>)this.a).get(cameraCharacteristics$Key);
            if (value != null) {
                return value;
            }
            final Object j = ((bx)this.b).j(cameraCharacteristics$Key);
            if (j != null) {
                ((Map<CameraCharacteristics$Key, Object>)this.a).put(cameraCharacteristics$Key, j);
            }
            return j;
        }
    }
    
    public final void B(final Context context, final Uri data) {
        ((Intent)this.b).setData(data);
        agu.b(context, (Intent)this.b, (Bundle)this.a);
    }
    
    public final Bundle C(final String s, final Bundle bundle) {
        try {
            final Object a = this.a;
            final Parcel obtain = Parcel.obtain();
            final Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                obtain.writeString(s);
                c.e(obtain, (Parcelable)bundle);
                ((aq)a).a.transact(5, obtain, obtain2, 0);
                obtain2.readException();
                final Parcelable$Creator creator = Bundle.CREATOR;
                Object fromParcel;
                if (obtain2.readInt() != 0) {
                    fromParcel = creator.createFromParcel(obtain2);
                }
                else {
                    fromParcel = null;
                }
                return (Bundle)fromParcel;
            }
            finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        catch (final RemoteException ex) {
            return null;
        }
    }
    
    public final void D(final Runnable runnable) {
        ((Choreographer)this.a).postFrameCallback((Choreographer$FrameCallback)new dyk(runnable, 1));
    }
    
    public final File E(Uri uri) {
        final String encodedPath = uri.getEncodedPath();
        final int index = encodedPath.indexOf(47, 1);
        final String decode = Uri.decode(encodedPath.substring(1, index));
        final String decode2 = Uri.decode(encodedPath.substring(index + 1));
        final File file = ((HashMap)this.a).get(decode);
        if (file != null) {
            uri = (Uri)new File(file, decode2);
            try {
                final File canonicalFile = ((File)uri).getCanonicalFile();
                if (canonicalFile.getPath().startsWith(file.getPath())) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            }
            catch (final IOException ex) {
                new StringBuilder("Failed to resolve canonical path for ").append(uri);
                throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(uri.toString()));
            }
        }
        new StringBuilder("Unable to find configured root for ").append(uri);
        throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(uri)));
    }
    
    public final void F(final ardu ardu) {
        if (ardu.a == 0) {
            ((Handler)this.a).post((Runnable)new vs((bx)this.b, (Typeface)ardu.b, 12, (byte[])null, (byte[])null, (byte[])null));
            return;
        }
        ((Handler)this.a).post((Runnable)new uy((bx)this.b, 11, (byte[])null, (byte[])null, (byte[])null));
    }
    
    public final void a(AttributeSet obtainStyledAttributes, final int n) {
        obtainStyledAttributes = (AttributeSet)((TextView)this.a).getContext().obtainStyledAttributes(obtainStyledAttributes, gl.i, n, 0);
        try {
            final boolean hasValue = ((TypedArray)obtainStyledAttributes).hasValue(14);
            boolean boolean1 = true;
            if (hasValue) {
                boolean1 = ((TypedArray)obtainStyledAttributes).getBoolean(14, true);
            }
            ((TypedArray)obtainStyledAttributes).recycle();
            this.b(boolean1);
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    public final void b(final boolean a) {
        final Object a2 = ((avt)this.b).a;
        asu.d();
        ((asu)a2).a.a = a;
    }
    
    public final boolean c() {
        return ((asu)((avt)this.b).a).a.a;
    }
    
    final void d(final on on) {
        qa a;
        if ((a = (qa)((abn)this.b).get((Object)on)) == null) {
            a = qa.a();
            ((abn)this.b).put((Object)on, (Object)a);
        }
        a.b |= 0x1;
    }
    
    public final void e(final long n, final on on) {
        ((abk)this.a).i(n, (Object)on);
    }
    
    public final void f() {
        ((abn)this.b).clear();
        ((abk)this.a).h();
    }
    
    final void g(final on on) {
        final qa qa = (qa)((abn)this.b).get((Object)on);
        if (qa == null) {
            return;
        }
        qa.b &= 0xFFFFFFFE;
    }
    
    final void h(final on on) {
        int c = ((abk)this.a).c();
        while (true) {
            int n;
            do {
                n = c - 1;
                if (n < 0) {
                    final qa qa = (qa)((abn)this.b).remove((Object)on);
                    if (qa != null) {
                        qa.b(qa);
                    }
                    return;
                }
                c = n;
            } while (on != ((abk)this.a).g(n));
            ((abk)this.a).k(n);
            continue;
        }
    }
    
    public final boolean i(final on on) {
        final qa qa = (qa)((abn)this.b).get((Object)on);
        return qa != null && (qa.b & 0x1) != 0x0;
    }
    
    public final alu j(final on on, final int n) {
        final int b = ((abn)this.b).b((Object)on);
        if (b < 0) {
            return null;
        }
        final qa qa = (qa)((abn)this.b).f(b);
        if (qa != null) {
            final int b2 = qa.b;
            if ((b2 & n) != 0x0) {
                final int b3 = ~n & b2;
                qa.b = b3;
                alu alu;
                if (n == 4) {
                    alu = qa.c;
                }
                else {
                    if (n != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    alu = qa.d;
                }
                if ((b3 & 0xC) == 0x0) {
                    ((abn)this.b).d(b);
                    qa.b(qa);
                }
                return alu;
            }
        }
        return null;
    }
    
    public final void k(final on on, final alu d) {
        qa a;
        if ((a = (qa)((abn)this.b).get((Object)on)) == null) {
            a = qa.a();
            ((abn)this.b).put((Object)on, (Object)a);
        }
        a.d = d;
        a.b |= 0x8;
    }
    
    public final void l(final on on, final alu c) {
        qa a;
        if ((a = (qa)((abn)this.b).get((Object)on)) == null) {
            a = qa.a();
            ((abn)this.b).put((Object)on, (Object)a);
        }
        a.c = c;
        a.b |= 0x4;
    }
    
    public final void m(final br br, final Bundle bundle, final boolean b) {
        final br n = ((cl)this.b).n;
        if (n != null) {
            n.G().y.m(br, bundle, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                final Object b2 = fwn.b;
            }
        }
    }
    
    public final void n(final br br, final boolean b) {
        final cl cl = (cl)this.b;
        final Context c = cl.l.c;
        final br n = cl.n;
        if (n != null) {
            n.G().y.n(br, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                final Object b2 = fwn.b;
            }
        }
    }
    
    public final void o(final br br, final Bundle bundle, final boolean b) {
        final br n = ((cl)this.b).n;
        if (n != null) {
            n.G().y.o(br, bundle, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                final Object b2 = fwn.b;
            }
        }
    }
    
    public final void p(final br br, final boolean b) {
        final br n = ((cl)this.b).n;
        if (n != null) {
            n.G().y.p(br, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                ((di)fwn.b).h(br);
            }
        }
    }
    
    public final void q(final br br, final boolean b) {
        final br n = ((cl)this.b).n;
        if (n != null) {
            n.G().y.q(br, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                final Object b2 = fwn.b;
            }
        }
    }
    
    public final void r(final br br, final boolean b) {
        final br n = ((cl)this.b).n;
        if (n != null) {
            n.G().y.r(br, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                ((di)fwn.b).i();
            }
        }
    }
    
    public final void s(final br br, final boolean b) {
        final cl cl = (cl)this.b;
        final Context c = cl.l.c;
        final br n = cl.n;
        if (n != null) {
            n.G().y.s(br, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                final Object b2 = fwn.b;
            }
        }
    }
    
    public final void t(final br br, final Bundle bundle, final boolean b) {
        final br n = ((cl)this.b).n;
        if (n != null) {
            n.G().y.t(br, bundle, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                final Object b2 = fwn.b;
            }
        }
    }
    
    public final void u(final br br, final boolean b) {
        final br n = ((cl)this.b).n;
        if (n != null) {
            n.G().y.u(br, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                ((di)fwn.b).j(br);
            }
        }
    }
    
    public final void v(final br br, final Bundle bundle, final boolean b) {
        final br n = ((cl)this.b).n;
        if (n != null) {
            n.G().y.v(br, bundle, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                ((di)fwn.b).k(br, bundle);
            }
        }
    }
    
    public final void w(final br br, final boolean b) {
        final br n = ((cl)this.b).n;
        if (n != null) {
            n.G().y.w(br, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                final Object b2 = fwn.b;
            }
        }
    }
    
    public final void x(final br br, final boolean b) {
        final br n = ((cl)this.b).n;
        if (n != null) {
            n.G().y.x(br, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                final Object b2 = fwn.b;
            }
        }
    }
    
    public final void y(final br br, final View view, final Bundle bundle, final boolean b) {
        final br n = ((cl)this.b).n;
        if (n != null) {
            n.G().y.y(br, view, bundle, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                final Object b2 = fwn.b;
            }
        }
    }
    
    public final void z(final br br, final boolean b) {
        final br n = ((cl)this.b).n;
        if (n != null) {
            n.G().y.z(br, true);
        }
        for (final fwn fwn : (CopyOnWriteArrayList)this.a) {
            if (!b || fwn.a) {
                final Object b2 = fwn.b;
            }
        }
    }
}
