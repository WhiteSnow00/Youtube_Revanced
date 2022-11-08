import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknb extends agzi implements ahax
{
    public static final aknb a;
    private static volatile ahbe c;
    public amgu b;
    private int d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(aknb.class, a = new aknb());
    }
    
    private aknb() {
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
                if ((c = aknb.c) == null) {
                    synchronized (aknb.class) {
                        if (aknb.c == null) {
                            aknb.c = (ahbe)new agzb((agzi)aknb.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aknb.a;
            }
            case 4: {
                return new agza((agzi)aknb.a);
            }
            case 3: {
                return new aknb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aknb.a, "\u0001\u0001\u0000\u0001\uf5b8\u3aab\uf5b8\u3aab\u0001\u0000\u0000\u0001\uf5b8\u3aab\u1409\u0000", new Object[] { "d", "b" });
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
