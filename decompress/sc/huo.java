import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.List;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class huo implements aezf
{
    public static final huo a;
    public static final huo b;
    public static final huo c;
    public static final huo d;
    public static final huo e;
    public static final huo f;
    public static final huo g;
    public static final huo h;
    public static final huo i;
    public static final huo j;
    public static final huo k;
    public static final huo l;
    public static final huo m;
    public static final huo n;
    public static final huo o;
    public static final huo p;
    public static final huo q;
    public static final huo r;
    public static final huo s;
    private final int t;
    
    static {
        s = new huo(20);
        r = new huo(19);
        q = new huo(18);
        p = new huo(17);
        o = new huo(16);
        n = new huo(14);
        m = new huo(13);
        l = new huo(12);
        k = new huo(10);
        j = new huo(9);
        i = new huo(8);
        h = new huo(7);
        g = new huo(6);
        f = new huo(5);
        e = new huo(4);
        d = new huo(3);
        c = new huo(2);
        b = new huo(1);
        a = new huo(0);
    }
    
    public huo(final int t) {
        this.t = t;
    }
    
    public final Object apply(final Object o) {
        switch (this.t) {
            default: {
                ttr.d("Error adding the singleton MainVideoEntity", (Throwable)o);
                final aaby b = aabz.b.b();
                b.b = 17;
                return b.a();
            }
            case 19: {
                return ((afeq)o).get(0);
            }
            case 18: {
                ttr.d("Error adding singleton MainVideoEntity for existing snapshot", (Throwable)o);
                final aaby b2 = aabz.b.b();
                b2.b = 17;
                return Optional.of((Object)b2.a());
            }
            case 17: {
                ttr.d("Error adding the MainVideoDownloadStateEntity", (Throwable)o);
                final aaby b3 = aabz.c.b();
                b3.b = 5;
                return b3.a();
            }
            case 16: {
                final Void void1 = (Void)o;
                return aabz.a;
            }
            case 15: {
                final List list = (List)o;
                final afel d = afeq.d();
                d.j(list);
                return iia.e(d.g());
            }
            case 14: {
                return ((iiw)o).a();
            }
            case 13: {
                final aqfw aqfw = (aqfw)o;
                final ahbb ahbb = (ahbb)((ahbh)ajmo.a).createBuilder();
                acbn.f(ahbb, aqfw);
                return ((ahaz)ahbb).build();
            }
            case 12: {
                final aqfw h = (aqfw)o;
                final ahaz builder = ajeo.a.createBuilder();
                builder.copyOnWrite();
                final ajeo ajeo = (ajeo)builder.instance;
                h.getClass();
                ajeo.h = h;
                ajeo.c |= 0x10;
                return builder.build();
            }
            case 11: {
                final aabb aabb = (aabb)o;
                final aabb a = aabb.a;
                ijk ijk = null;
                switch (aabb.ordinal()) {
                    default: {
                        ttr.b("Unrecognized OfflineVideoDisplayState, defaulting to unknown");
                        ijk = ijk.o;
                        break;
                    }
                    case 22: {
                        ijk = ijk.n;
                        break;
                    }
                    case 21: {
                        ijk = ijk.k;
                        break;
                    }
                    case 20: {
                        ijk = ijk.j;
                        break;
                    }
                    case 18: {
                        ijk = ijk.m;
                        break;
                    }
                    case 17: {
                        ijk = ijk.i;
                        break;
                    }
                    case 16: {
                        ijk = ijk.h;
                        break;
                    }
                    case 15: {
                        ijk = ijk.g;
                        break;
                    }
                    case 13: {
                        ijk = ijk.l;
                        break;
                    }
                    case 12: {
                        ijk = ijk.f;
                        break;
                    }
                    case 10: {
                        ijk = ijk.e;
                        break;
                    }
                    case 5: {
                        ijk = ijk.b;
                        break;
                    }
                    case 4:
                    case 6:
                    case 7:
                    case 8:
                    case 9: {
                        ijk = ijk.d;
                        break;
                    }
                    case 3: {
                        ijk = ijk.c;
                        break;
                    }
                    case 1: {
                        ijk = ijk.a;
                        break;
                    }
                }
                return ijk;
            }
            case 10: {
                return Optional.ofNullable((Object)o);
            }
            case 9: {
                return ((ijk)o).p;
            }
            case 8: {
                return apyi.d((String)o);
            }
            case 7: {
                return apzl.d((String)o);
            }
            case 6: {
                final String d2 = (String)o;
                d2.getClass();
                adkp.R(d2.isEmpty() ^ true, (Object)"key cannot be empty");
                final ahaz builder2 = ((ahbh)alzy.a).createBuilder();
                builder2.copyOnWrite();
                final alzy alzy = (alzy)builder2.instance;
                alzy.c |= 0x1;
                alzy.d = d2;
                return new alzv(builder2);
            }
            case 5: {
                return Collection$_EL.stream((Collection)o).filter((Predicate)hoi.u).collect(afci.a);
            }
            case 4: {
                return Collection$_EL.stream((Collection)o).map((Function)hvv.t).collect(afci.a);
            }
            case 3: {
                return o;
            }
            case 2: {
                final apij apij = (apij)o;
                Object o2;
                if (apij.getNumVideosFailed() > 0) {
                    o2 = hve.a((int)apij.getNumVideosFailed(), apij.getNumVideosFailed() + apij.getNumVideosInProgress() + apij.getNumVideosCompleted());
                }
                else if (apij.getNumVideosInProgress() > 0) {
                    o2 = hvg.a((float)apij.getUploadProgress(), (int)apij.getNumVideosInProgress(), (int)apij.getNumVideosCompleted(), (int)apij.getNumVideosFailed());
                }
                else {
                    o2 = hvd.a((int)apij.getNumVideosCompleted(), (int)apij.getNumVideosInProgress(), (int)apij.getNumVideosFailed());
                }
                return o2;
            }
            case 1: {
                final ahaz builder3 = ((ahbh)o).toBuilder();
                builder3.copyOnWrite();
                final adnw adnw = (adnw)builder3.instance;
                adnw.b &= 0xFFFFFFFE;
                adnw.d = adnw.a.d;
                builder3.copyOnWrite();
                final adnw adnw2 = (adnw)builder3.instance;
                adnw2.b &= 0xFFFFFFFD;
                adnw2.e = adnw.a.e;
                builder3.copyOnWrite();
                final adnw adnw3 = (adnw)builder3.instance;
                adnw3.b &= 0xFFFFFFFB;
                adnw3.f = adnw.a.f;
                return builder3.build();
            }
            case 0: {
                return Optional.ofNullable((Object)((aezp)o).f()).flatMap((Function)hpl.s).map((Function)hpl.t).orElseThrow((Supplier)fdi.n);
            }
        }
    }
}
