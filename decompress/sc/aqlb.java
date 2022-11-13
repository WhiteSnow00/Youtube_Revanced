import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlb extends ahbh implements ahcw
{
    public static final aqlb a;
    public static final ahbf b;
    private static volatile ahdd d;
    public String c;
    private int e;
    
    static {
        final aqlb a2 = new aqlb();
        ahbh.registerDefaultInstance((Class)aqlb.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 315253727, ahek.k, (Class)aqlb.class);
    }
    
    private aqlb() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd d;
                if ((d = aqlb.d) == null) {
                    synchronized (aqlb.class) {
                        if (aqlb.d == null) {
                            aqlb.d = (ahdd)new ahba((ahbh)aqlb.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aqlb.a;
            }
            case 4: {
                return new ahaz((ahbh)aqlb.a);
            }
            case 3: {
                return new aqlb();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlb.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "e", "c" });
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
