import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aikt extends agzi implements ahax
{
    public static final aikt a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aikt.class, a = new aikt());
    }
    
    private aikt() {
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
                if ((d = aikt.d) == null) {
                    synchronized (aikt.class) {
                        if (aikt.d == null) {
                            aikt.d = (ahbe)new agzb((agzi)aikt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aikt.a;
            }
            case 4: {
                return new agza((agzi)aikt.a);
            }
            case 3: {
                return new aikt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aikt.a, "\u0001\u0001\u0001\u0000\uf697\u1cd7\uf697\u1cd7\u0001\u0000\u0000\u0001\uf697\u1cd7\u143c\u0000", new Object[] { "c", "b", ansi.class });
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
