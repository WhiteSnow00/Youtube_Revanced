import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpt extends agzi implements ahax
{
    public static final agpt a;
    private static volatile ahbe e;
    public int b;
    public boolean c;
    public agpq d;
    private agpu f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(agpt.class, a = new agpt());
    }
    
    private agpt() {
        this.g = 2;
        emptyProtobufList();
        emptyLongList();
        emptyProtobufList();
        emptyProtobufList();
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
                final ahbe e;
                if ((e = agpt.e) == null) {
                    synchronized (agpt.class) {
                        if (agpt.e == null) {
                            agpt.e = (ahbe)new agzb((agzi)agpt.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return agpt.a;
            }
            case 4: {
                return new agza((agzi)agpt.a);
            }
            case 3: {
                return new agpt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpt.a, "\u0001\u0003\u0000\u0001\u0003\u001e\u0003\u0000\u0000\u0001\u0003\u1007\u0002\u001c\u1009\u0013\u001e\u1409\u0015", new Object[] { "b", "c", "d", "f" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
