import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptj extends ahcu implements ahcv
{
    public static final aptj a;
    private static volatile ahev i;
    public int b;
    public apts c;
    public aptp d;
    public ahdp e;
    public int f;
    public ajws g;
    public ajoq h;
    private ahjl j;
    private byte k;
    
    static {
        ahcz.registerDefaultInstance(aptj.class, (ahcz)(a = new aptj()));
    }
    
    private aptj() {
        this.k = 2;
        this.e = emptyProtobufList();
        final ahbt b = ahbt.b;
        emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = aptj.i) == null) {
                    synchronized (aptj.class) {
                        if (aptj.i == null) {
                            aptj.i = (ahev)new ahcs((ahcz)aptj.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aptj.a;
            }
            case 4: {
                return new ahct((ahcu)aptj.a);
            }
            case 3: {
                return new aptj();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptj.a, "\u0001\u0007\u0000\u0001\u0001\u000b\u0007\u0000\u0001\u0005\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u041b\u0004\u1004\u0002\u0005\u1409\u0003\b\u1409\u0005\u000b\u1009\u0004", new Object[] { "b", "c", "d", "e", apug.class, "f", "g", "j", "h" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
