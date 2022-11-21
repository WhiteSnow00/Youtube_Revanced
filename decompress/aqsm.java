import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsm extends ahcz implements aheo
{
    public static final aqsm a;
    private static volatile ahev f;
    public int b;
    public String c;
    public aqsn d;
    public ahej e;
    
    static {
        ahcz.registerDefaultInstance(aqsm.class, a = new aqsm());
    }
    
    private aqsm() {
        this.e = ahej.a;
        this.c = "";
    }
    
    public final ahej a() {
        final ahej e = this.e;
        if (!e.b) {
            this.e = e.a();
        }
        return this.e;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aqsm.f) == null) {
                    synchronized (aqsm.class) {
                        if (aqsm.f == null) {
                            aqsm.f = (ahev)new ahcs((ahcz)aqsm.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqsm.a;
            }
            case 4: {
                return new ahcr((char[][])null, (int[][])null);
            }
            case 3: {
                return new aqsm();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsm.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u00032", new Object[] { "b", "c", "d", "e", aqsl.a });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
