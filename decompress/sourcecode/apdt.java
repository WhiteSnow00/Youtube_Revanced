import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apdt extends agzi implements ahax
{
    public static final apdt a;
    private static volatile ahbe d;
    public int b;
    public Object c;
    private byte e;
    
    static {
        agzi.registerDefaultInstance(apdt.class, a = new apdt());
    }
    
    private apdt() {
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
                if ((d = apdt.d) == null) {
                    synchronized (apdt.class) {
                        if (apdt.d == null) {
                            apdt.d = (ahbe)new agzb((agzi)apdt.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return apdt.a;
            }
            case 4: {
                return new agza((agzi)apdt.a);
            }
            case 3: {
                return new apdt();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apdt.a, "\u0001\u0001\u0001\u0000\ue80a\u2ea3\ue80a\u2ea3\u0001\u0000\u0000\u0001\ue80a\u2ea3\u143c\u0000", new Object[] { "c", "b", aiqc.class });
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
