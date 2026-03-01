/*
 * Copyright (c) 2021, 2022, APT Group, Department of Computer Science,
 * The University of Manchester.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package uk.ac.manchester.tornado.unittests.foundation;

import uk.ac.manchester.tornado.api.annotations.Parallel;
import uk.ac.manchester.tornado.api.types.arrays.DoubleArray;
import uk.ac.manchester.tornado.api.types.arrays.FloatArray;
import uk.ac.manchester.tornado.api.types.arrays.IntArray;
import uk.ac.manchester.tornado.api.types.arrays.LongArray;
import uk.ac.manchester.tornado.api.types.arrays.ShortArray;
import uk.ac.manchester.tornado.api.types.matrix.Matrix2DFloat;

public class TestKernels {
    public static void copyTest(IntArray a) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, 50);
        }
    }

    public static void addValue(IntArray a) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, a.get(i) + 50);
        }
    }

    public static void copyTest2(IntArray a, IntArray b) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i));
        }
    }

    public static void compute(IntArray a, IntArray b) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) + 50);
        }
    }

    public static void init(IntArray a, IntArray b) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, 100);
            b.set(i, 500);
        }
    }

    public static void vectorAddCompute(IntArray a, IntArray b, IntArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) + c.get(i));
        }
    }

    public static void vectorMul(IntArray a, IntArray b, IntArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) * c.get(i));
        }
    }

    public static void vectorSub(IntArray a, IntArray b, IntArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) - c.get(i));
        }
    }

    public static void vectorDiv(IntArray a, IntArray b, IntArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) / c.get(i));
        }
    }

    public static void vectorSquare(IntArray a, IntArray b) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) * b.get(i));
        }
    }

    public static void saxpy(IntArray a, IntArray b, IntArray c, int alpha) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, alpha * b.get(i) + c.get(i));
        }
    }

    public static void copyTestZero(IntArray a) {
        a.set(0, 50);
    }

    public static void sum(int[] a, int[] b, int[] c) {
        for (@Parallel int i = 0; i < a.length; i++) {
            a[i] = b[i] + c[i];
        }
    }

    public static void vectorAddFloatCompute(FloatArray a, FloatArray b, FloatArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) + c.get(i));
        }
    }

    public static void vectorAddDoubleCompute(DoubleArray a, DoubleArray b, DoubleArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) + c.get(i));
        }
    }

    public static void vectorMulDoubleCompute(DoubleArray a, DoubleArray b, DoubleArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) * c.get(i));
        }
    }

    public static void vectorSubDoubleCompute(DoubleArray a, DoubleArray b, DoubleArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) - c.get(i));
        }
    }

    public static void vectorDivDoubleCompute(DoubleArray a, DoubleArray b, DoubleArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) / c.get(i));
        }
    }

    public static void vectorSubFloatCompute(FloatArray a, FloatArray b, FloatArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) - c.get(i));
        }
    }

    public static void vectorMulFloatCompute(FloatArray a, FloatArray b, FloatArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) * c.get(i));
        }
    }

    public static void vectorDivFloatCompute(FloatArray a, FloatArray b, FloatArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) / c.get(i));
        }
    }

    public static void testFloatCopy(FloatArray a) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, 50.0f);
        }
    }

    public static void testDoublesCopy(DoubleArray a) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, 50);
        }
    }

    public static void testLongsCopy(LongArray a) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, 50);
        }
    }

    public static void vectorSumLongCompute(LongArray a, LongArray b, LongArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, b.get(i) + c.get(i));
        }
    }

    public static void vectorSumShortCompute(ShortArray a, ShortArray b, ShortArray c) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            a.set(i, (short) (b.get(i) + c.get(i)));
        }
    }

    public static void testIfInt(IntArray a) {
        if (a.get(0) == 0) {
            a.set(0, 50);
        }
    }

    public static void testIfInt2(IntArray a) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            if (a.get(i) == 0) {
                a.set(i, 50);
            }
        }
    }

    public static void testIfInt3(IntArray a) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            if (a.get(i) == 0) {
                a.set(i, 50);
            } else {
                a.set(i, 100);
            }
        }
    }

    public static void testIfInt4(IntArray a) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            if (a.get(i) > 0) {
                a.set(i, 50);
            } else {
                a.set(i, 100);
            }
        }
    }

    public static void testIfInt5(IntArray a) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            if (a.get(i) >= 0) {
                a.set(i, 50);
            } else {
                a.set(i, 100);
            }
        }
    }

    public static void testIfInt6(IntArray a) {
        for (@Parallel int i = 0; i < a.getSize(); i++) {
            if (a.get(i) >= 0 && a.get(i) <= 1) { // Note : there is a bug with multiple conditions, && is not generated
                a.set(i, 100);
            } else {
                a.set(i, 200);
            }
        }
    }

    public static void testIf7(
            FloatArray selfX,
            IntArray selfAlive,
            FloatArray scratch,
            FloatArray config) {
        int maxSelf = (int) config.get(1);
        for (@Parallel int i = 0; i < maxSelf; i++) {
            if (selfAlive.get(i) != 0) {
                float px = selfX.get(0);
                int chunkX = (int) (px / 2);
                for (int cdy = 0; cdy <= 1; cdy++) {
                    for (int cdx = 0; cdx <= 1; cdx++) {
                        int ccx = chunkX + cdx;
                        if (ccx >= 0) {
                            for (int k = 0; k < 1; k++) {
                                scratch.set(1, 2);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void testIf8(
            IntArray plantGrid,
            Matrix2DFloat rayDists,
            int selfIndex) {
        for (int t = 2; t < 50.0f; t += 1) {
            if (plantGrid.get(1) > 20) {
                if (t < rayDists.get(selfIndex, 1)) {
                    plantGrid.set(1, 2);
                }
                break;
            }
        }
    }

    public static void testIf9(FloatArray arr, IntArray arr2) {
        for (int i = 0; i < 100; i++) {
            int chunkX = (int) arr.get(0);
            int chunkY = (int) arr.get(0);
            int chunkRange = 2;

            for (int cdx = -chunkRange; cdx <= chunkRange; cdx++) {
                int cx = chunkX;
                int cy = chunkY;
                if (cx < 0 || cx >= 64 || cy < 0 || cy >= 64) continue;
                for (int k = 0; k < cx; k++) {
                    arr2.set(2, 3);
                }
            }
        }
    }
}
