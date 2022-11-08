import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aotl extends agzi implements ahax
{
    public static final aotl a;
    private static volatile ahbe b;
    private int c;
    private ajsq d;
    private ajsq e;
    private aibc f;
    private aibc g;
    private ahfw h;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aotl.class, a = new aotl());
    }
    
    private aotl() {
        this.i = 2;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        final agyc b = agyc.b;
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
                if ((b2 = aotl.b) == null) {
                    synchronized (aotl.class) {
                        if (aotl.b == null) {
                            aotl.b = (ahbe)new agzb((agzi)aotl.a);
                        }
                    }
                }
                return b2;
            }
            case 5: {
                return aotl.a;
            }
            case 4: {
                return new agza((agzi)aotl.a);
            }
            case 3: {
                return new aotl();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aotl.a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001\u1409\u0000\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1409\u0004\u0007\u1409\u0001", new Object[] { "c", "d", "f", "g", "h", "e" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
