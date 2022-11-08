import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aidi extends agzi implements ahax
{
    public static final aidi a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aidi.class, (agzi)(a = new aidi()));
    }
    
    private aidi() {
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
                if ((d = aidi.d) == null) {
                    synchronized (aidi.class) {
                        if (aidi.d == null) {
                            aidi.d = (ahbe)new agzb((agzi)aidi.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aidi.a;
            }
            case 4: {
                return new agza((agzi)aidi.a);
            }
            case 3: {
                return new aidi();
            }
            case 2: {
                return newMessageInfo((MessageLite)aidi.a, "\u0001\u0002\u0001\u0000\uf26a\u2912\uf63f\u4515\u0002\u0000\u0000\u0002\uf26a\u2912\u143c\u0000\uf63f\u4515\u143c\u0000", new Object[] { "c", "b", alhe.class, ajax.class });
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
