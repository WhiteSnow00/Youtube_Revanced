import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqvg extends ahcz implements aheo
{
    public static final aqvg a;
    private static volatile ahev f;
    public int b;
    public ahbt c;
    public ahfq d;
    public ahfq e;
    private String g;
    
    static {
        ahcz.registerDefaultInstance(aqvg.class, a = new aqvg());
    }
    
    private aqvg() {
        this.g = "";
        this.c = ahbt.b;
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
                if ((f = aqvg.f) == null) {
                    synchronized (aqvg.class) {
                        if (aqvg.f == null) {
                            aqvg.f = (ahev)new ahcs((ahcz)aqvg.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqvg.a;
            }
            case 4: {
                return new ahcr((ahcz)aqvg.a);
            }
            case 3: {
                return new aqvg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqvg.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001\u0003\u1009\u0002\u0004\u1009\u0003", new Object[] { "b", "g", "c", "d", "e" });
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
