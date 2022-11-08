import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class agpz extends agzi implements ahax
{
    public static final agpz a;
    private static volatile ahbe c;
    public agzy b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance(agpz.class, a = new agpz());
    }
    
    private agpz() {
        this.d = 2;
        this.b = agzi.emptyProtobufList();
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
                if ((c = agpz.c) == null) {
                    synchronized (agpz.class) {
                        if (agpz.c == null) {
                            agpz.c = (ahbe)new agzb((agzi)agpz.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return agpz.a;
            }
            case 4: {
                return new agza((agzi)agpz.a);
            }
            case 3: {
                return new agpz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)agpz.a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", agqa.class });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.d = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
