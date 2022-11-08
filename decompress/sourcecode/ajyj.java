import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajyj extends agzi implements ahax
{
    public static final ajyj a;
    private static volatile ahbe c;
    public ajyi b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(ajyj.class, a = new ajyj());
    }
    
    private ajyj() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = ajyj.c) == null) {
                    synchronized (ajyj.class) {
                        if (ajyj.c == null) {
                            ajyj.c = (ahbe)new agzb((agzi)ajyj.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return ajyj.a;
            }
            case 4: {
                return new agza((agzi)ajyj.a);
            }
            case 3: {
                return new ajyj();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajyj.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", new Object[] { "d", "b" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.e = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
