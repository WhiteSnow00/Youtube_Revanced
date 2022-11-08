import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anea extends agzi implements ahax
{
    public static final anea a;
    private static volatile ahbe d;
    public int b;
    public aneb c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(anea.class, a = new anea());
    }
    
    private anea() {
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
                if ((d = anea.d) == null) {
                    synchronized (anea.class) {
                        if (anea.d == null) {
                            anea.d = (ahbe)new agzb((agzi)anea.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return anea.a;
            }
            case 4: {
                return new agza((agzi)anea.a);
            }
            case 3: {
                return new anea();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anea.a, "\u0001\u0001\u0000\u0001\uebc6\u36be\uebc6\u36be\u0001\u0000\u0000\u0001\uebc6\u36be\u1409\u0000", new Object[] { "b", "c" });
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
