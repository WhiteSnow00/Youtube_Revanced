import java.util.concurrent.Executor;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.content.Context;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aih
{
    public static final abo a;
    private static final aio b;
    
    static {
        if (Build$VERSION.SDK_INT >= 29) {
            b = new ail();
        }
        else if (Build$VERSION.SDK_INT >= 28) {
            b = (aio)new aik();
        }
        else {
            b = (aio)new aij();
        }
        a = new abo(16);
    }
    
    public static Typeface a(final Context context, final Typeface typeface, final int n) {
        if (context != null) {
            return Typeface.create(typeface, n);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }
    
    public static Typeface b(final Context context, final Resources resources, final int n, final String s, final int n2, final int n3) {
        final Typeface d = aih.b.d(context, resources, n, s, n3);
        if (d != null) {
            aih.a.d((Object)c(resources, n, s, n2, n3), (Object)d);
        }
        return d;
    }
    
    public static String c(final Resources resources, final int n, final String s, final int n2, final int n3) {
        final StringBuilder sb = new StringBuilder(resources.getResourcePackageName(n));
        sb.append('-');
        sb.append(s);
        sb.append('-');
        sb.append(n2);
        sb.append('-');
        sb.append(n);
        sb.append('-');
        sb.append(n3);
        return sb.toString();
    }
    
    public static Typeface d(final Context context, ahl ahl, final Resources resources, final int n, final String s, final int n2, final int n3, final aht aht, final boolean b) {
        Object o = null;
        Label_0584: {
            Label_0538: {
                if (ahl instanceof aho) {
                    final aho aho = (aho)ahl;
                    final String d = aho.d;
                    final Typeface typeface = null;
                    Typeface typeface2 = null;
                    Label_0072: {
                        if (d != null) {
                            if (!d.isEmpty()) {
                                final Typeface create = Typeface.create(d, 0);
                                final Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
                                if (create != null) {
                                    typeface2 = create;
                                    if (!create.equals((Object)create2)) {
                                        break Label_0072;
                                    }
                                }
                            }
                        }
                        typeface2 = null;
                    }
                    if (typeface2 != null) {
                        if (aht != null) {
                            aht.d(typeface2);
                        }
                        return typeface2;
                    }
                    final boolean b2 = b ? (aho.c == 0) : (aht == null);
                    int b3;
                    if (b) {
                        b3 = aho.b;
                    }
                    else {
                        b3 = -1;
                    }
                    final Handler e = aht.e();
                    final bx bx = new bx(aht);
                    final ajx a = aho.a;
                    final kh kh = new kh(bx, e, (byte[])null, (byte[])null, (byte[])null);
                    Label_0219: {
                        if (b2) {
                            final String a2 = aka.a(a, n3);
                            final Typeface typeface3 = (Typeface)aka.a.c((Object)a2);
                            if (typeface3 != null) {
                                kh.F(new arjd(typeface3));
                                o = typeface3;
                            }
                            else if (b3 == -1) {
                                final arjd b4 = aka.b(a2, context, a, n3);
                                kh.F(b4);
                                o = b4.b;
                            }
                            else {
                                final cua cua = new cua(a2, context, a, n3, 1);
                                try {
                                    final arjd arjd = (arjd)aet.b(aka.b, (Callable)cua, b3);
                                    kh.F(arjd);
                                    o = arjd.b;
                                }
                                catch (final InterruptedException ex) {
                                    kh.F(new arjd(-3, null, null, null));
                                    o = typeface;
                                }
                            }
                        }
                        else {
                            final String a3 = aka.a(a, n3);
                            final Typeface typeface4 = (Typeface)aka.a.c((Object)a3);
                            if (typeface4 == null) {
                                final ajz ajz = new ajz(kh, 1, (byte[])null, (byte[])null);
                                ahl = (ahl)aka.c;
                                synchronized (ahl) {
                                    final ArrayList list = (ArrayList)aka.d.get((Object)a3);
                                    if (list != null) {
                                        list.add(ajz);
                                        monitorexit(ahl);
                                        break Label_0219;
                                    }
                                    final ArrayList<ajz> list2 = new ArrayList<ajz>();
                                    list2.add(ajz);
                                    aka.d.put((Object)a3, (Object)list2);
                                    monitorexit(ahl);
                                    final ajy ajy = new ajy(a3, context, a, n3);
                                    ahl = (ahl)aka.b;
                                    final ajz ajz2 = new ajz(a3, 0);
                                    Handler handler;
                                    if (Looper.myLooper() == null) {
                                        handler = new Handler(Looper.getMainLooper());
                                    }
                                    else {
                                        handler = new Handler();
                                    }
                                    ((Executor)ahl).execute(new cnv(handler, ajy, (akp)ajz2, 1));
                                    break Label_0219;
                                }
                                break Label_0538;
                            }
                            kh.F(new arjd(typeface4));
                            o = typeface4;
                        }
                    }
                    break Label_0584;
                }
            }
            final Typeface typeface5 = (Typeface)(o = aih.b.a(context, (ahm)ahl, resources, n3));
            if (aht != null) {
                if (typeface5 != null) {
                    aht.d(typeface5);
                    o = typeface5;
                }
                else {
                    aht.c(-3);
                    o = typeface5;
                }
            }
        }
        if (o != null) {
            aih.a.d((Object)c(resources, n, s, n2, n3), o);
        }
        return (Typeface)o;
    }
    
    public static Typeface e(final Context context, final CancellationSignal cancellationSignal, final ogz[] array, final int n) {
        return aih.b.b(context, cancellationSignal, array, n);
    }
}
