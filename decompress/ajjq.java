import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajjq extends ahbh implements ahcw
{
    public static final ajjq a;
    public static final ahbf b;
    private static volatile ahdd h;
    public int c;
    public String d;
    public CommandOuterClass$Command e;
    public ahab f;
    public aqfw g;
    private byte i;
    
    static {
        final ajjq a2 = new ajjq();
        ahbh.registerDefaultInstance((Class)ajjq.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 410903799, ahek.k, (Class)ajjq.class);
    }
    
    private ajjq() {
        this.i = 2;
        this.d = "";
        this.f = ahab.b;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte i = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd h;
                if ((h = ajjq.h) == null) {
                    synchronized (ajjq.class) {
                        if (ajjq.h == null) {
                            ajjq.h = (ahdd)new ahba((ahbh)ajjq.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajjq.a;
            }
            case 4: {
                return new ahaz((ahbh)ajjq.a);
            }
            case 3: {
                return new ajjq();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajjq.a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001\u1008\u0000\u0002\u1409\u0001\u0003\u100a\u0002\u0004\u1409\u0003", new Object[] { "c", "d", "e", "f", "g" });
            }
            case 1: {
                if (o == null) {
                    i = 0;
                }
                this.i = i;
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
