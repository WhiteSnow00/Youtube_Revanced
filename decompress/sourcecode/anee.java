import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anee extends agzi implements ahax
{
    public static final anee a;
    private static volatile ahbe d;
    public int b;
    public anen c;
    private apad e;
    private byte f;
    
    static {
        agzi.registerDefaultInstance(anee.class, a = new anee());
    }
    
    private anee() {
        this.f = 2;
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
                if ((d = anee.d) == null) {
                    synchronized (anee.class) {
                        if (anee.d == null) {
                            anee.d = (ahbe)new agzb((agzi)anee.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anee.a;
            }
            case 4: {
                return new agza((agzi)anee.a);
            }
            case 3: {
                return new anee();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anee.a, "\u0001\u0002\u0000\u0001\uebb2\u1b41\uf5a0\u6ffc\u0002\u0000\u0000\u0002\uebb2\u1b41\u1409\u0000\uf5a0\u6ffc\u1409\u0001", new Object[] { "b", "c", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.f = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.f;
            }
        }
    }
}
