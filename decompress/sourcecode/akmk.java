import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akmk extends agzi implements ahax
{
    public static final akmk a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(akmk.class, a = new akmk());
    }
    
    private akmk() {
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
                final ahbe b2;
                if ((b2 = akmk.b) == null) {
                    synchronized (akmk.class) {
                        if (akmk.b == null) {
                            akmk.b = (ahbe)new agzb((agzi)akmk.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return akmk.a;
            }
            case 4: {
                return new agza((agzi)akmk.a);
            }
            case 3: {
                return new akmk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akmk.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "c", "d" });
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
