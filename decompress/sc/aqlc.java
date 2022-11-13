import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqlc extends ahbh implements ahcw
{
    public static final aqlc a;
    public static final ahbf b;
    private static volatile ahdd e;
    public int c;
    public String d;
    
    static {
        final aqlc a2 = new aqlc();
        ahbh.registerDefaultInstance((Class)aqlc.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 455760676, ahek.k, (Class)aqlc.class);
    }
    
    private aqlc() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aqlc.e) == null) {
                    synchronized (aqlc.class) {
                        if (aqlc.e == null) {
                            aqlc.e = (ahdd)new ahba((ahbh)aqlc.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aqlc.a;
            }
            case 4: {
                return new ahaz((ahbh)aqlc.a);
            }
            case 3: {
                return new aqlc();
            }
            case 2: {
                return newMessageInfo((MessageLite)aqlc.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1008\u0000", new Object[] { "c", "d" });
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
