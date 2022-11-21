import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjx extends ahcz implements aheo
{
    public static final aqjx a;
    public static final ahcx b;
    private static volatile ahev e;
    public String c;
    public ahbt d;
    private int f;
    
    static {
        final aqjx a2 = new aqjx();
        ahcz.registerDefaultInstance(aqjx.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 170382720, ahgc.k, aqjx.class);
    }
    
    private aqjx() {
        this.c = "";
        this.d = ahbt.b;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = aqjx.e) == null) {
                    synchronized (aqjx.class) {
                        if (aqjx.e == null) {
                            aqjx.e = (ahev)new ahcs((ahcz)aqjx.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqjx.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjx.a);
            }
            case 3: {
                return new aqjx();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjx.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "f", "c", "d" });
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
