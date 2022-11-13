import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoxh extends ahbh implements ahcw
{
    public static final aoxh a;
    public static final ahbf b;
    private static volatile ahdd e;
    public String c;
    public int d;
    private int f;
    
    static {
        final aoxh a2 = new aoxh();
        ahbh.registerDefaultInstance((Class)aoxh.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 476972423, ahek.k, (Class)aoxh.class);
    }
    
    private aoxh() {
        this.c = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        switch (ahbg.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd e;
                if ((e = aoxh.e) == null) {
                    synchronized (aoxh.class) {
                        if (aoxh.e == null) {
                            aoxh.e = (ahdd)new ahba((ahbh)aoxh.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aoxh.a;
            }
            case 4: {
                return new ahaz((ahbh)aoxh.a);
            }
            case 3: {
                return new aoxh();
            }
            case 2: {
                return newMessageInfo((MessageLite)aoxh.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1004\u0001", new Object[] { "f", "c", "d" });
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
