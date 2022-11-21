import java.util.Set;
import java.util.List;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.nio.ByteBuffer;
import android.text.TextUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aarc implements asmi
{
    public final Object a;
    private final int b;
    
    public aarc(final aard a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aarc(final aare a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aarc(final aasp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aarc(final aawf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aarc(final aawp a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aarc(final aaxa a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aarc(final aaya a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aarc(final aayh a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aarc(final aazo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aarc(final abao a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aarc(final abfq a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    public aarc(final adfa a, final int b, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public aarc(final aslm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aarc(final isk a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(Object e) {
        switch (this.b) {
            default: {
                ((abao)this.a).a((aaoe)e);
                return;
            }
            case 19: {
                ((abao)this.a).c((aapq)e);
                return;
            }
            case 18: {
                ((abao)this.a).b((aapp)e);
                return;
            }
            case 17: {
                ((abfq)this.a).a((aaoe)e);
                return;
            }
            case 16: {
                ((abfq)this.a).b((aapp)e);
                return;
            }
            case 15: {
                final Object a = this.a;
                final aapp aapp = (aapp)e;
                if (aapp.c().a(abll.c) && aapp.d().i() != null && aapp.d().f() != null && !aapp.d().f().z()) {
                    if (!((List)aapp.b().z().G).isEmpty()) {
                        aapp.d().i().c((acam)new aazn((aazo)a, aapp, 0));
                    }
                }
                return;
            }
            case 14: {
                final Object a2 = this.a;
                final aapd aapd = (aapd)e;
                e = ((adfa)a2).e;
                if (e != null) {
                    ((aazk)e).c();
                }
                return;
            }
            case 13: {
                ((aslm)this.a).c((asln)e);
                return;
            }
            case 12: {
                final Object a3 = this.a;
                final aapd aapd2 = (aapd)e;
                final aayh aayh = (aayh)a3;
                if (!aayh.c) {
                    final aayu e2 = aayh.e;
                    if (e2 != null) {
                        e2.b();
                    }
                }
                return;
            }
            case 11: {
                final Object a4 = this.a;
                final aapf aapf = (aapf)e;
                final aayh aayh2 = (aayh)a4;
                if (aayh2.b) {
                    return;
                }
                aayh2.g(aapf);
                return;
            }
            case 10: {
                final Object a5 = this.a;
                final aapp aapp2 = (aapp)e;
                final String e3 = aapp2.e();
                final aayh aayh3 = (aayh)a5;
                aayh3.g = e3;
                if (!TextUtils.isEmpty((CharSequence)e3)) {
                    final aazb d = aayh3.d;
                    aazb.b((xab)d.e, (xbe)d.b, e3);
                }
                if (aayh3.h != aazc.a) {
                    final PlayerResponseModel a6 = aapp2.a();
                    final String k = aapp2.k();
                    final aazb d2 = aayh3.d;
                    final aisc h = aayh3.h();
                    if (a6 != null) {
                        if (!TextUtils.isEmpty((CharSequence)k)) {
                            if (!((Set)d2.a).contains(ByteBuffer.wrap(a6.Y()))) {
                                final Object e4 = d2.e;
                                if (!TextUtils.isEmpty((CharSequence)k)) {
                                    aazb.b((xab)d2.e, aazb.a(h), k);
                                }
                                aazb.d((xbm)e4, (Runnable)tkz.g, new wzy(a6.Y()), h);
                                ((Set<ByteBuffer>)d2.a).add(ByteBuffer.wrap(a6.Y()));
                            }
                        }
                    }
                }
                return;
            }
            case 9: {
                ((aaya)this.a).d((aaoe)e);
                return;
            }
            case 8: {
                final Object a7 = this.a;
                final aapf aapf2 = (aapf)e;
                final WatchNextResponseModel a8 = aapf2.a();
                aniy aniy2;
                final aniy aniy = aniy2 = null;
                if (a8 != null) {
                    aniy2 = aniy;
                    if (aapf2.a().i != null) {
                        anip anip;
                        if ((anip = aapf2.a().i.h) == null) {
                            anip = anip.a;
                        }
                        aniy2 = aniy;
                        if ((0x1 & anip.b) != 0x0) {
                            anip anip2;
                            if ((anip2 = aapf2.a().i.h) == null) {
                                anip2 = anip.a;
                            }
                            if ((aniy2 = anip2.c) == null) {
                                aniy2 = aniy.a;
                            }
                        }
                    }
                }
                if (aapf2.c() == abli.b) {
                    final aaxc b = ((aaxa)a7).b;
                    if (b != null) {
                        final aatc h2 = b.h;
                        if (h2 != null) {
                            final aatb i = h2.k;
                            if (i != null) {
                                i.removeAllViews();
                            }
                        }
                    }
                }
                if (aniy2 != null) {
                    final int min = Math.min(4, aniy2.d.size());
                    final anja[] c = new anja[min];
                    final aaxa aaxa = (aaxa)a7;
                    aaxa.c = c;
                    System.arraycopy(((List)aniy2.d).toArray(new anja[0]), 0, aaxa.c, 0, min);
                    final aaxc b2 = aaxa.b;
                    if (b2 != null) {
                        b2.b(aaxa.c);
                    }
                    aaxa.a.D((xbe)new wzy(aniy2.g));
                }
                return;
            }
            case 7: {
                ((aawp)this.a).a((aapp)e);
                return;
            }
            case 6: {
                ((aawf)this.a).b((aaoe)e);
                return;
            }
            case 5: {
                ((aawf)this.a).c((aapp)e);
                return;
            }
            case 4: {
                ((aasp)this.a).g((aapt)e);
                return;
            }
            case 3: {
                ((aasp)this.a).f((aapp)e);
                return;
            }
            case 2: {
                ((aare)this.a).a((aapp)e);
                return;
            }
            case 1: {
                final Object a9 = this.a;
                if (((aapc)e).c().a(ablh.f)) {
                    ((aaqx)((isk)a9).a).e();
                }
                return;
            }
            case 0: {
                ((aard)this.a).a((aapp)e);
            }
        }
    }
}
