import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amir extends agzi implements ahax
{
    public static final amir a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)amir.class, (agzi)(a = new amir()));
    }
    
    private amir() {
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
                if ((d = amir.d) == null) {
                    synchronized (amir.class) {
                        if (amir.d == null) {
                            amir.d = (ahbe)new agzb((agzi)amir.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return amir.a;
            }
            case 4: {
                return new agza((agzi)amir.a);
            }
            case 3: {
                return new amir();
            }
            case 2: {
                return newMessageInfo((MessageLite)amir.a, "\u0001\u0001\u0001\u0000\uf03a\u2b94\uf03a\u2b94\u0001\u0000\u0000\u0001\uf03a\u2b94\u143c\u0000", new Object[] { "c", "b", ahyu.class });
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
