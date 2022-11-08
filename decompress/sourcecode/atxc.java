import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atxc extends agzi implements ahax
{
    public static final atxc a;
    private static volatile ahbe c;
    public agzy b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance(atxc.class, a = new atxc());
    }
    
    private atxc() {
        this.d = 2;
        this.b = agzi.emptyProtobufList();
    }
    
    public final void a() {
        final agzy b = this.b;
        if (!b.c()) {
            this.b = agzi.mutableCopy(b);
        }
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
                if ((c = atxc.c) == null) {
                    synchronized (atxc.class) {
                        if (atxc.c == null) {
                            atxc.c = (ahbe)new agzb((agzi)atxc.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return atxc.a;
            }
            case 4: {
                return new agza((boolean[])null, (int[])null);
            }
            case 3: {
                return new atxc();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)atxc.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", atxb.class });
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
