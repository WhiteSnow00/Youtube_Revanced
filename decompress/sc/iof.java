// 
// Decompiled by Procyon v0.6.0
// 

public final class iof implements inq
{
    private final tjm a;
    private final fmj b;
    private final atke c;
    private final aait d;
    private final int e;
    private final zaz f;
    
    public iof(final tjm a, final fmj b, final zaz f, final atke c, final aait d, final int e, final byte[] array, final byte[] array2, final byte[] array3) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.f = f;
        this.c = c;
        this.d = d;
    }
    
    public final aezp a(final aabb aabb, final aabe aabe, final akwz akwz) {
        final int e = this.e;
        final Integer value = 2132017945;
        final Integer value2 = 2132017946;
        final Integer value3 = 2132017944;
        final Integer value4 = 2132017927;
        final Integer value5 = 2132017939;
        final Integer value6 = 2132017943;
        final Integer value7 = 2132017942;
        final Integer value8 = 2132017948;
        if (e != 0) {
            final boolean o = this.a.o();
            final aabb a = aabb.a;
            Object o2 = null;
            switch (aabb.ordinal()) {
                default: {
                    o2 = aeyo.a;
                    break;
                }
                case 22: {
                    o2 = aezp.k((Object)value4);
                    break;
                }
                case 21: {
                    o2 = aezp.k((Object)2132017947);
                    break;
                }
                case 20: {
                    o2 = aezp.k((Object)2132017921);
                    break;
                }
                case 19: {
                    if (o) {
                        o2 = aezp.k((Object)2132017928);
                        break;
                    }
                    o2 = aezp.k((Object)2132017929);
                    break;
                }
                case 17: {
                    final boolean a2 = this.b.a;
                    if (aabe != null) {
                        amus amus;
                        if ((amus = amus.b(aabe.b.j)) == null) {
                            amus = amus.a;
                        }
                        if (amus == amus.d) {
                            o2 = aezp.k((Object)2132017926);
                            break;
                        }
                    }
                    if (!o) {
                        o2 = aezp.k((Object)2132017924);
                        break;
                    }
                    if (a2) {
                        o2 = aezp.k((Object)value2);
                        break;
                    }
                    o2 = aezp.k((Object)2132017923);
                    break;
                }
                case 15:
                case 16: {
                    o2 = aezp.k((Object)2132017935);
                    break;
                }
                case 13: {
                    o2 = aezp.k((Object)2132017931);
                    break;
                }
                case 12: {
                    if (akwz == null) {
                        o2 = aezp.k((Object)2132017935);
                        break;
                    }
                    int cg;
                    if ((cg = aqsx.cG(akwz.c)) == 0) {
                        cg = 1;
                    }
                    if (--cg == 4) {
                        o2 = aezp.k((Object)2132017934);
                        break;
                    }
                    if (cg != 5) {
                        o2 = aezp.k((Object)2132017935);
                        break;
                    }
                    o2 = aezp.k((Object)2132017933);
                    break;
                }
                case 10: {
                    o2 = aezp.k((Object)value5);
                    break;
                }
                case 9: {
                    o2 = aezp.k((Object)value6);
                    break;
                }
                case 7: {
                    if (this.d.e() && this.f.p() && ((aaec)this.c.a()).w() == aqra.c) {
                        o2 = aezp.k((Object)value);
                        break;
                    }
                    o2 = aezp.k((Object)value3);
                    break;
                }
                case 6: {
                    o2 = aezp.k((Object)value7);
                    break;
                }
                case 5: {
                    o2 = aezp.k((Object)2132017940);
                    break;
                }
                case 4: {
                    o2 = aezp.k((Object)value8);
                    break;
                }
            }
            return (aezp)o2;
        }
        final aabb a3 = aabb.a;
        Object o3 = null;
        switch (aabb.ordinal()) {
            default: {
                o3 = aeyo.a;
                break;
            }
            case 22: {
                o3 = aezp.k((Object)value4);
                break;
            }
            case 20: {
                o3 = aezp.k((Object)2132017922);
                break;
            }
            case 19: {
                o3 = aezp.k((Object)2132017930);
                break;
            }
            case 17: {
                if (this.b.a && this.a.o()) {
                    o3 = aezp.k((Object)value2);
                    break;
                }
                o3 = aezp.k((Object)2132017925);
                break;
            }
            case 13: {
                o3 = aezp.k((Object)2132017932);
                break;
            }
            case 12:
            case 15:
            case 16: {
                o3 = aezp.k((Object)2132017936);
                break;
            }
            case 10: {
                o3 = aezp.k((Object)value5);
                break;
            }
            case 9: {
                o3 = aezp.k((Object)value6);
                break;
            }
            case 7: {
                if (this.d.e() && this.f.p() && ((aaec)this.c.a()).w() == aqra.c) {
                    o3 = aezp.k((Object)value);
                    break;
                }
                o3 = aezp.k((Object)value3);
                break;
            }
            case 6: {
                o3 = aezp.k((Object)value7);
                break;
            }
            case 5: {
                o3 = aezp.k((Object)2132017941);
                break;
            }
            case 4: {
                o3 = aezp.k((Object)value8);
                break;
            }
        }
        return (aezp)o3;
    }
}
