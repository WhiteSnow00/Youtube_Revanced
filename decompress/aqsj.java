import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqsj extends ahcz implements aheo
{
    public static final aqsj a;
    private static volatile ahev f;
    public int b;
    public ango c;
    public ahxw d;
    public ahej e;
    private byte g;
    
    static {
        ahcz.registerDefaultInstance(aqsj.class, a = new aqsj());
    }
    
    private aqsj() {
        this.e = ahej.a;
        this.g = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte g = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = aqsj.f) == null) {
                    synchronized (aqsj.class) {
                        if (aqsj.f == null) {
                            aqsj.f = (ahev)new ahcs((ahcz)aqsj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqsj.a;
            }
            case 4: {
                return new ahcr((ahcz)aqsj.a);
            }
            case 3: {
                return new aqsj();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqsj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0001\u0001\u1409\u0000\u0002\u1009\u0001\u00032", new Object[] { "b", "c", "d", "e", aqsi.a });
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
