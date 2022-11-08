import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aivt extends agzi implements ahax
{
    public static final aivt a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aivt.class, a = new aivt());
    }
    
    private aivt() {
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
                if ((d = aivt.d) == null) {
                    synchronized (aivt.class) {
                        if (aivt.d == null) {
                            aivt.d = (ahbe)new agzb((agzi)aivt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aivt.a;
            }
            case 4: {
                return new agza((agzi)aivt.a);
            }
            case 3: {
                return new aivt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aivt.a, "\u0001\u0001\u0001\u0000\uf3fb\u30fa\uf3fb\u30fa\u0001\u0000\u0000\u0001\uf3fb\u30fa\u143c\u0000", new Object[] { "c", "b", ajzl.class });
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
