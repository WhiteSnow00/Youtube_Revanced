import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aici extends agzi implements ahax
{
    public static final aici a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private ajsq f;
    private aioe g;
    private aioe h;
    private aibc i;
    private aibc j;
    private aibc k;
    private aioe l;
    private aioe m;
    private aioe n;
    private ahfw o;
    private byte p;
    
    static {
        agzi.registerDefaultInstance((Class)aici.class, (agzi)(a = new aici()));
    }
    
    private aici() {
        this.p = 2;
        emptyProtobufList();
        final agyc b = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b2;
                if ((b2 = aici.b) == null) {
                    synchronized (aici.class) {
                        if (aici.b == null) {
                            aici.b = (ahbe)new agzb((agzi)aici.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aici.a;
            }
            case 4: {
                return new agza((agzi)aici.a);
            }
            case 3: {
                return new aici();
            }
            case 2: {
                return newMessageInfo((MessageLite)aici.a, "\u0001\f\u0000\u0001\u0001\u0016\f\u0000\u0000\f\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\b\u1409\b\t\u1409\t\n\u1409\n\u000b\u1409\u000b\r\u1409\u0010\u000f\u1409\u0014\u0013\u1409\u0011\u0014\u1409\u0012\u0016\u1409\u0006", new Object[] { "c", "d", "e", "f", "h", "i", "j", "k", "l", "o", "m", "n", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.p = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.p;
            }
        }
    }
}
