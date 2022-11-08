import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class andy extends agzi implements ahax
{
    public static final andy a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(andy.class, a = new andy());
    }
    
    private andy() {
        this.b = 0;
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
                final ahbe d;
                if ((d = andy.d) == null) {
                    synchronized (andy.class) {
                        if (andy.d == null) {
                            andy.d = (ahbe)new agzb((agzi)andy.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return andy.a;
            }
            case 4: {
                return new agza((agzi)andy.a);
            }
            case 3: {
                return new andy();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)andy.a, "\u0001\u0002\u0001\u0000\ueb11\u1f11\ueaaa\u1fae\u0002\u0000\u0000\u0002\ueb11\u1f11\u143c\u0000\ueaaa\u1fae\u143c\u0000", new Object[] { "c", "b", aibb.class, ameo.class });
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
