import java.util.Iterator;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.Map;
import java.util.PriorityQueue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fav implements tec
{
    private final vax a;
    private final PriorityQueue b;
    private long c;
    private boolean d;
    
    public fav(final vax a) {
        this.a = a;
        this.b = new PriorityQueue();
    }
    
    public final void a() {
        this.b.clear();
        this.c = 0L;
        this.d = false;
    }
    
    public final Class[] ms(final Class clazz, final Object o, int t) {
        Class[] array2;
        if (t != -1) {
            final Class[] array = null;
            if (t != 0) {
                if (t != 1) {
                    if (t != 2) {
                        if (t != 3) {
                            final StringBuilder sb = new StringBuilder("unsupported op code: ");
                            sb.append(t);
                            throw new IllegalStateException(sb.toString());
                        }
                        final aalz aalz = (aalz)o;
                        if (this.d) {
                            array2 = array;
                        }
                        else {
                            final long e = aalz.e();
                            array2 = array;
                            if (e >= this.c) {
                                while (!this.b.isEmpty() && e >= this.b.peek().a) {
                                    this.a.c(this.b.poll().b, (Map)null);
                                }
                                this.c = e;
                                array2 = array;
                            }
                        }
                    }
                    else {
                        if (((aaly)o).c() == abim.h) {
                            this.d = true;
                            return null;
                        }
                        array2 = array;
                    }
                }
                else {
                    final ryv ryv = (ryv)o;
                    array2 = array;
                    if (ryv.a() == ryu.b) {
                        this.a();
                        final PlayerAd c = ryv.c();
                        if (c == null) {
                            array2 = array;
                        }
                        else {
                            final Iterator iterator = c.A().iterator();
                            while (true) {
                                array2 = array;
                                if (!iterator.hasNext()) {
                                    break;
                                }
                                final ahmb ahmb = (ahmb)iterator.next();
                                final long millis = TimeUnit.SECONDS.toMillis(c.c());
                                Object o2 = null;
                                Label_0473: {
                                    if ((ahmb.b & 0x1) != 0x0) {
                                        ahmc ahmc;
                                        if ((ahmc = ahmb.c) == null) {
                                            ahmc = ahmc.a;
                                        }
                                        if ((t = aeda.T(ahmc.b)) == 0) {
                                            t = 1;
                                        }
                                        long d;
                                        if (--t != 1) {
                                            if (t != 2) {
                                                o2 = Collections.emptyList();
                                                break Label_0473;
                                            }
                                            d = ahmc.d;
                                        }
                                        else {
                                            d = Math.round(ahmc.c * millis);
                                        }
                                        final ArrayList list = new ArrayList();
                                        if ((ahmb.b & 0x2) != 0x0) {
                                            aioe aioe;
                                            if ((aioe = ahmb.d) == null) {
                                                aioe = aioe.a;
                                            }
                                            list.add(new fau(d, aioe));
                                        }
                                        if ((ahmb.b & 0x4) != 0x0) {
                                            aioe aioe2;
                                            if ((aioe2 = ahmb.e) == null) {
                                                aioe2 = aioe.a;
                                            }
                                            list.add(new fau(d, aioe2));
                                        }
                                        o2 = afcr.o((Collection)list);
                                    }
                                    else {
                                        o2 = Collections.emptyList();
                                    }
                                }
                                this.b.addAll((Collection)o2);
                            }
                        }
                    }
                }
            }
            else {
                if (((rys)o).a() == sau.a) {
                    while (!this.b.isEmpty()) {
                        this.a.c(this.b.poll().b, (Map)null);
                    }
                }
                this.a();
                array2 = array;
            }
        }
        else {
            array2 = new Class[] { rys.class, ryv.class, aaly.class, aalz.class };
        }
        return array2;
    }
}
