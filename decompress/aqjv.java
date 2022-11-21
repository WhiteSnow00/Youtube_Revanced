import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjv extends ahcz implements aheo
{
    public static final aqjv a;
    public static final ahcx b;
    private static volatile ahev f;
    public int c;
    public long d;
    public String e;
    
    static {
        final aqjv a2 = new aqjv();
        ahcz.registerDefaultInstance(aqjv.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 428067722, ahgc.k, aqjv.class);
    }
    
    private aqjv() {
        this.e = "";
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
                if ((f = aqjv.f) == null) {
                    synchronized (aqjv.class) {
                        if (aqjv.f == null) {
                            aqjv.f = (ahev)new ahcs((ahcz)aqjv.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aqjv.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjv.a);
            }
            case 3: {
                return new aqjv();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjv.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1008\u0001", new Object[] { "c", "d", "e" });
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
