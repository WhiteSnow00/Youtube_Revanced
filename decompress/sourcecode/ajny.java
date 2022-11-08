import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajny extends agzi implements ahax
{
    public static final ajny a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public int d;
    public ajnt e;
    public ajnz f;
    public ajnx g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance((Class)ajny.class, (agzi)(a = new ajny()));
    }
    
    private ajny() {
        this.i = 2;
        this.c = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe h;
                if ((h = ajny.h) == null) {
                    synchronized (ajny.class) {
                        if (ajny.h == null) {
                            ajny.h = (ahbe)new agzb((agzi)ajny.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajny.a;
            }
            case 4: {
                return new agza((agzi)ajny.a);
            }
            case 3: {
                return new ajny();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajny.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1409\u0003\u0004\u1009\u0002\u0005\u1009\u0004", new Object[] { "b", "c", "d", ajoa.a, "f", "e", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
