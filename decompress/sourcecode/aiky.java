import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiky extends agzi implements ahax
{
    public static final aiky a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aiky.class, a = new aiky());
    }
    
    private aiky() {
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
                if ((d = aiky.d) == null) {
                    synchronized (aiky.class) {
                        if (aiky.d == null) {
                            aiky.d = (ahbe)new agzb((agzi)aiky.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aiky.a;
            }
            case 4: {
                return new agza((agzi)aiky.a);
            }
            case 3: {
                return new aiky();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiky.a, "\u0001\u0001\u0001\u0000\ufec4\u172c\ufec4\u172c\u0001\u0000\u0000\u0001\ufec4\u172c\u143c\u0000", new Object[] { "c", "b", aitc.class });
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
