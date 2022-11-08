import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibt extends agzi implements ahax
{
    public static final aibt a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aibt.class, (agzi)(a = new aibt()));
    }
    
    private aibt() {
        this.b = 0;
        this.e = 2;
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
                final ahbe d;
                if ((d = aibt.d) == null) {
                    synchronized (aibt.class) {
                        if (aibt.d == null) {
                            aibt.d = (ahbe)new agzb((agzi)aibt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aibt.a;
            }
            case 4: {
                return new agza((agzi)aibt.a);
            }
            case 3: {
                return new aibt();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibt.a, "\u0001\u0001\u0001\u0000\ueaaa\u1fae\ueaaa\u1fae\u0001\u0000\u0000\u0001\ueaaa\u1fae\u143c\u0000", new Object[] { "c", "b", ameo.class });
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
