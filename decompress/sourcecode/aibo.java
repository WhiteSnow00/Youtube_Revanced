import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aibo extends agzi implements ahax
{
    public static final aibo a;
    private static volatile ahbe d;
    public int b;
    public aibn c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance((Class)aibo.class, (agzi)(a = new aibo()));
    }
    
    private aibo() {
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
                if ((d = aibo.d) == null) {
                    synchronized (aibo.class) {
                        if (aibo.d == null) {
                            aibo.d = (ahbe)new agzb((agzi)aibo.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aibo.a;
            }
            case 4: {
                return new agza((agzi)aibo.a);
            }
            case 3: {
                return new aibo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aibo.a, "\u0001\u0001\u0000\u0001\uf1ff\u450b\uf1ff\u450b\u0001\u0000\u0000\u0001\uf1ff\u450b\u1409\u0000", new Object[] { "b", "c" });
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
