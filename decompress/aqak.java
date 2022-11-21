import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqak extends ahcu implements ahcv
{
    public static final aqak a;
    private static volatile ahev d;
    public ahbt b;
    public ajws c;
    private int e;
    private ahjl f;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aqak.class, (ahcz)(a = new aqak()));
    }
    
    private aqak() {
        this.g = 2;
        this.b = ahbt.b;
    }
    
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aqak.d) == null) {
                    synchronized (aqak.class) {
                        if (aqak.d == null) {
                            aqak.d = (ahev)new ahcs((ahcz)aqak.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqak.a;
            }
            case 4: {
                return new ahct((ahcu)aqak.a);
            }
            case 3: {
                return new aqak();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqak.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001\u100a\u0000\u0004\u1409\u0004\u0005\u1409\u0006", new Object[] { "e", "b", "c", "f" });
            }
            case 1: {
                if (o == null) {
                    g = 0;
                }
                this.g = g;
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
