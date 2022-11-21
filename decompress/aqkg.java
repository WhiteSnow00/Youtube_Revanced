import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

@Deprecated
public final class aqkg extends ahcz implements aheo
{
    public static final aqkg a;
    public static final ahcx b;
    private static volatile ahev e;
    public String c;
    public ahbt d;
    private int f;
    
    static {
        final aqkg a2 = new aqkg();
        ahcz.registerDefaultInstance(aqkg.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 170382760, ahgc.k, aqkg.class);
    }
    
    private aqkg() {
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
                if ((e = aqkg.e) == null) {
                    synchronized (aqkg.class) {
                        if (aqkg.e == null) {
                            aqkg.e = (ahev)new ahcs((ahcz)aqkg.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqkg.a;
            }
            case 4: {
                return new ahcr((ahcz)aqkg.a);
            }
            case 3: {
                return new aqkg();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqkg.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u100a\u0001", new Object[] { "f", "c", "d" });
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
