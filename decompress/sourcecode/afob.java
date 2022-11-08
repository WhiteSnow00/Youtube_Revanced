import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class afob extends agzi implements ahax
{
    public static final afob a;
    private static volatile ahbe c;
    public agzy b;
    private byte d;
    
    static {
        agzi.registerDefaultInstance(afob.class, a = new afob());
    }
    
    private afob() {
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
                if ((c = afob.c) == null) {
                    synchronized (afob.class) {
                        if (afob.c == null) {
                            afob.c = (ahbe)new agzb((agzi)afob.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return afob.a;
            }
            case 4: {
                return new agza((agzi)afob.a);
            }
            case 3: {
                return new afob();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)afob.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u041b", new Object[] { "b", afoa.class });
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
