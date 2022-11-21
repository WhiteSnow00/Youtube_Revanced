import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqk extends ahcz implements aheo
{
    public static final aqqk a;
    public static final ahcx b;
    private static volatile ahev c;
    private byte d;
    
    static {
        final aqqk a2 = new aqqk();
        ahcz.registerDefaultInstance(aqqk.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 334455667, ahgc.k, aqqk.class);
    }
    
    private aqqk() {
        this.d = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev c;
                if ((c = aqqk.c) == null) {
                    synchronized (aqqk.class) {
                        if (aqqk.c == null) {
                            aqqk.c = (ahev)new ahcs((ahcz)aqqk.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return aqqk.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqk.a);
            }
            case 3: {
                return new aqqk();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqk.a, "\u0001\u0000", null);
            }
            case 1: {
                byte d;
                if (o == null) {
                    d = 0;
                }
                else {
                    d = 1;
                }
                this.d = d;
                return null;
            }
            case 0: {
                return this.d;
            }
        }
    }
}
