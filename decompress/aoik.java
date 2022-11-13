import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aoik extends ahbc implements ahbd
{
    public static final aoik a;
    private static volatile ahdd e;
    public int b;
    public ajut c;
    public aoij d;
    private ajut f;
    private ajut g;
    private aiao h;
    private aiao i;
    private ajut j;
    private ajut k;
    private ajut m;
    private apnh n;
    private aiqj o;
    private aoie p;
    private aoie q;
    private anuv r;
    private ahhu s;
    private byte t;
    
    static {
        ahbh.registerDefaultInstance((Class)aoik.class, (ahbh)(a = new aoik()));
    }
    
    private aoik() {
        this.t = 2;
        emptyProtobufList();
        emptyProtobufList();
        final ahab b = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte t = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aoik.e) == null) {
                    synchronized (aoik.class) {
                        if (aoik.e == null) {
                            aoik.e = (ahdd)new ahba((ahbh)aoik.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoik.a;
            }
            case 4: {
                return new ahbb((ahbc)aoik.a);
            }
            case 3: {
                return new aoik();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoik.a, "\u0001\u000f\u0000\u0001\u0003\u0018\u000f\u0000\u0000\u000f\u0003\u1409\u0001\u0004\u1409\u0002\u0005\u1409\u0003\b\u1409\t\t\u1409\u000b\n\u1409\f\f\u1409\u0006\r\u1409\u0005\u000f\u1409\n\u0010\u1409\u0012\u0012\u1409\r\u0014\u1409\u000e\u0015\u1409\u000f\u0016\u1409\u0010\u0018\u1409\u0007", new Object[] { "b", "c", "f", "g", "d", "m", "n", "i", "h", "k", "s", "o", "p", "q", "r", "j" });
            }
            case 1: {
                if (o == null) {
                    t = 0;
                }
                this.t = t;
                return null;
            }
            case 0: {
                return this.t;
            }
        }
    }
}
