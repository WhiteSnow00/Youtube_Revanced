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

public final class aig
{
    public static final abn a;
    private static final ain b;
    
    static {
        if (Build$VERSION.SDK_INT >= 29) {
            b = (ain)new aik();
        }
        else if (Build$VERSION.SDK_INT >= 28) {
            b = (ain)new aij();
        }
        else {
            b = (ain)new aii();
        }
        a = new abn(16);
    }
    
    public static Typeface a(final Context context, final Typeface typeface, final int n) {
        if (context != null) {
            return Typeface.create(typeface, n);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }
    
    public static Typeface b(final Context context, final Resources resources, final int n, final String s, final int n2, final int n3) {
        final Typeface d = aig.b.d(context, resources, n, s, n3);
        if (d != null) {
            aig.a.d(c(resources, n, s, n2, n3), d);
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
    
    public static Typeface d(final Context context, ahk ahk, final Resources resources, final int n, final String s, final int n2, final int n3, final ahs ahs, final boolean b) {
        Object o = null;
        Label_0584: {
            Label_0538: {
                if (ahk instanceof ahn) {
                    final ahn ahn = (ahn)ahk;
                    final String d = ahn.d;
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
                        if (ahs != null) {
                            ahs.d(typeface2);
                        }
                        return typeface2;
                    }
                    final boolean b2 = b ? (ahn.c == 0) : (ahs == null);
                    int b3;
                    if (b) {
                        b3 = ahn.b;
                    }
                    else {
                        b3 = -1;
                    }
                    final Handler e = ahs.e();
                    final bx bx = new bx(ahs);
                    final ajw a = ahn.a;
                    final kg kg = new kg(bx, e, (byte[])null, (byte[])null, (byte[])null);
                    Label_0219: {
                        if (b2) {
                            final String a2 = ajz.a(a, n3);
                            final Typeface typeface3 = (Typeface)ajz.a.c(a2);
                            if (typeface3 != null) {
                                kg.F(new argj(typeface3));
                                o = typeface3;
                            }
                            else if (b3 == -1) {
                                final argj b4 = ajz.b(a2, context, a, n3);
                                kg.F(b4);
                                o = b4.b;
                            }
                            else {
                                final ctx ctx = new ctx(a2, context, a, n3, 1);
                                try {
                                    final argj argj = (argj)aew.d(ajz.b, (Callable)ctx, b3);
                                    kg.F(argj);
                                    o = argj.b;
                                }
                                catch (final InterruptedException ex) {
                                    kg.F(new argj(-3, (char[])null, (byte[])null, (byte[])null));
                                    o = typeface;
                                }
                            }
                        }
                        else {
                            final String a3 = ajz.a(a, n3);
                            final Typeface typeface4 = (Typeface)ajz.a.c(a3);
                            if (typeface4 == null) {
                                final ajy ajy = new ajy(kg, 1, null, null);
                                ahk = (ahk)ajz.c;
                                synchronized (ahk) {
                                    final ArrayList list = (ArrayList)ajz.d.get(a3);
                                    if (list != null) {
                                        list.add(ajy);
                                        monitorexit(ahk);
                                        break Label_0219;
                                    }
                                    final ArrayList<ajy> list2 = new ArrayList<ajy>();
                                    list2.add(ajy);
                                    ajz.d.put(a3, list2);
                                    monitorexit(ahk);
                                    final ajx ajx = new ajx(a3, context, a, n3);
                                    ahk = (ahk)ajz.b;
                                    final ajy ajy2 = new ajy(a3, 0);
                                    Handler handler;
                                    if (Looper.myLooper() == null) {
                                        handler = new Handler(Looper.getMainLooper());
                                    }
                                    else {
                                        handler = new Handler();
                                    }
                                    ((Executor)ahk).execute((Runnable)new cns(handler, (Callable)ajx, (ako)ajy2, 1));
                                    break Label_0219;
                                }
                                break Label_0538;
                            }
                            kg.F(new argj(typeface4));
                            o = typeface4;
                        }
                    }
                    break Label_0584;
                }
            }
            final Typeface typeface5 = (Typeface)(o = aig.b.a(context, (ahl)ahk, resources, n3));
            if (ahs != null) {
                if (typeface5 != null) {
                    ahs.d(typeface5);
                    o = typeface5;
                }
                else {
                    ahs.c(-3);
                    o = typeface5;
                }
            }
        }
        if (o != null) {
            aig.a.d(c(resources, n, s, n2, n3), o);
        }
        return (Typeface)o;
    }
    
    public static Typeface e(final Context context, final CancellationSignal cancellationSignal, final ogh[] array, final int n) {
        return aig.b.b(context, cancellationSignal, array, n);
    }
}
