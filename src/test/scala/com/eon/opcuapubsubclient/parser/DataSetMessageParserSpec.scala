package com.eon.opcuapubsubclient.parser

import com.eon.opcuapubsubclient.UnitSpec
import com.eon.opcuapubsubclient.UnitSpec._
import org.scalatest.BeforeAndAfterAll

// TODO: Under implementation
class DataSetMessageParserSpec extends UnitSpec with BeforeAndAfterAll {

  val meta = "145 132 8 45 0 0 0 65 56 48 48 48 95 67 80 56 48 50 120 95 101 115 115 101 110 95 108 97 98 95 67 80 95 56 48 50 49 95 50 95 71 70 49 56 49 56 49 56 49 56 49 56 2 19 0 232 3 3 0 0 0 0 0 0 0 44 0 0 0 104 116 116 112 58 47 47 115 105 101 109 101 110 115 46 99 111 109 47 101 110 101 114 103 121 47 115 99 104 101 109 97 47 111 112 99 117 97 47 112 115 47 118 50 36 0 0 0 104 116 116 112 115 58 47 47 109 105 110 100 115 112 104 101 114 101 46 105 111 47 79 80 67 85 65 80 117 98 83 117 98 47 118 51 5 0 0 0 1 1 1 0 0 0 8 0 0 0 83 80 83 86 97 108 117 101 1 0 76 0 1 0 22 0 0 0 0 0 3 0 0 0 8 0 0 0 86 97 108 117 101 95 113 99 0 1 0 7 0 255 255 255 255 255 255 255 255 0 0 0 0 0 5 0 0 0 95 116 105 109 101 0 1 0 13 0 255 255 255 255 255 255 255 255 0 0 0 0 0 5 0 0 0 86 97 108 117 101 0 1 0 1 0 255 255 255 255 255 255 255 255 0 0 0 0 0 1 1 2 0 0 0 8 0 0 0 68 80 83 86 97 108 117 101 1 0 76 0 1 0 22 0 0 0 0 0 3 0 0 0 8 0 0 0 86 97 108 117 101 95 113 99 0 1 0 7 0 255 255 255 255 255 255 255 255 0 0 0 0 0 5 0 0 0 95 116 105 109 101 0 1 0 13 0 255 255 255 255 255 255 255 255 0 0 0 0 0 5 0 0 0 86 97 108 117 101 0 1 0 3 0 255 255 255 255 255 255 255 255 0 0 0 0 0 1 1 4 0 0 0 12 0 0 0 83 116 101 112 80 111 115 86 97 108 117 101 1 0 76 0 1 0 22 0 0 0 0 0 4 0 0 0 8 0 0 0 86 97 108 117 101 95 113 99 0 1 0 7 0 255 255 255 255 255 255 255 255 0 0 0 0 0 5 0 0 0 95 116 105 109 101 0 1 0 13 0 255 255 255 255 255 255 255 255 0 0 0 0 0 5 0 0 0 86 97 108 117 101 0 1 0 6 0 255 255 255 255 255 255 255 255 0 0 0 0 0 9 0 0 0 84 114 97 110 115 105 101 110 116 0 1 0 1 0 255 255 255 255 255 255 255 255 0 0 0 0 0 1 1 3 0 0 0 13 0 0 0 77 101 97 115 117 114 101 100 86 97 108 117 101 1 0 76 0 1 0 22 0 0 0 0 0 3 0 0 0 8 0 0 0 86 97 108 117 101 95 113 99 0 1 0 7 0 255 255 255 255 255 255 255 255 0 0 0 0 0 5 0 0 0 95 116 105 109 101 0 1 0 13 0 255 255 255 255 255 255 255 255 0 0 0 0 0 5 0 0 0 86 97 108 117 101 0 1 0 10 0 255 255 255 255 255 255 255 255 0 0 0 0 0 1 1 5 0 0 0 12 0 0 0 67 111 117 110 116 101 114 86 97 108 117 101 1 0 76 0 1 0 22 0 0 0 0 0 4 0 0 0 8 0 0 0 86 97 108 117 101 95 113 99 0 1 0 7 0 255 255 255 255 255 255 255 255 0 0 0 0 0 5 0 0 0 95 116 105 109 101 0 1 0 13 0 255 255 255 255 255 255 255 255 0 0 0 0 0 5 0 0 0 86 97 108 117 101 0 1 0 8 0 255 255 255 255 255 255 255 255 0 0 0 0 0 3 0 0 0 81 84 89 0 1 0 10 0 255 255 255 255 255 255 255 255 0 0 0 0 0 255 255 255 255 255 255 255 255 15 0 0 0 83 73 69 77 69 78 83 95 68 97 116 97 115 101 116 0 46 0 0 0 56 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 70 97 117 108 116 68 105 114 101 99 116 105 111 110 95 65 46 70 101 104 108 101 114 114 105 99 104 116 117 110 103 58 72 117 109 98 111 108 100 115 116 114 2 56 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 70 97 117 108 116 68 105 114 101 99 116 105 111 110 95 65 46 70 101 104 108 101 114 114 105 99 104 116 117 110 103 58 72 117 109 98 111 108 100 115 116 114 1 0 0 0 0 1 0 0 0 1 22 1 1 1 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 0 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 0 0 0 0 20 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 83 119 105 116 99 104 2 20 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 83 119 105 116 99 104 1 0 0 0 0 1 0 0 0 1 22 1 1 2 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 1 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 0 0 0 0 54 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 70 97 117 108 116 68 105 114 101 99 116 105 111 110 95 66 46 70 101 104 108 101 114 114 105 99 104 116 117 110 103 58 71 117 103 101 108 115 116 114 2 54 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 70 97 117 108 116 68 105 114 101 99 116 105 111 110 95 66 46 70 101 104 108 101 114 114 105 99 104 116 117 110 103 58 71 117 103 101 108 115 116 114 1 0 0 0 0 1 0 0 0 1 22 1 1 1 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 2 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 0 0 0 0 27 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 83 119 105 116 99 104 69 97 114 116 104 101 100 2 27 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 83 119 105 116 99 104 69 97 114 116 104 101 100 1 0 0 0 0 1 0 0 0 1 22 1 1 2 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 3 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 0 0 0 0 32 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 67 117 114 114 101 110 116 95 78 46 73 76 78 2 32 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 67 117 114 114 101 110 116 95 78 46 73 76 78 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 4 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 65 27 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 67 111 115 80 104 105 46 67 111 115 80 104 105 2 27 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 67 111 115 80 104 105 46 67 111 115 80 104 105 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 5 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 0 0 0 0 7 0 0 0 77 86 47 70 117 115 101 2 7 0 0 0 77 86 47 70 117 115 101 1 0 0 0 0 1 0 0 0 1 22 1 1 1 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 6 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 0 0 0 0 47 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 70 97 117 108 116 105 110 100 105 99 97 116 105 111 110 46 72 117 109 98 111 108 100 115 116 114 46 70 101 104 108 101 114 2 47 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 70 97 117 108 116 105 110 100 105 99 97 116 105 111 110 46 72 117 109 98 111 108 100 115 116 114 46 70 101 104 108 101 114 1 0 0 0 0 1 0 0 0 1 22 1 1 1 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 7 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 0 0 0 0 27 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 67 117 114 114 101 110 116 95 65 46 73 76 49 2 27 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 67 117 114 114 101 110 116 95 65 46 73 76 49 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 8 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 65 27 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 67 117 114 114 101 110 116 95 66 46 73 76 50 2 27 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 67 117 114 114 101 110 116 95 66 46 73 76 50 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 9 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 65 28 0 0 0 65 108 97 114 109 47 116 114 97 110 115 102 111 114 109 46 79 101 108 115 116 97 110 100 104 111 99 104 2 28 0 0 0 65 108 97 114 109 47 116 114 97 110 115 102 111 114 109 46 79 101 108 115 116 97 110 100 104 111 99 104 1 0 0 0 0 1 0 0 0 1 22 1 1 1 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 10 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 0 0 0 0 31 0 0 0 65 108 97 114 109 47 116 114 97 110 115 102 111 114 109 46 79 101 108 115 116 97 110 100 110 105 101 100 114 105 103 2 31 0 0 0 65 108 97 114 109 47 116 114 97 110 115 102 111 114 109 46 79 101 108 115 116 97 110 100 110 105 101 100 114 105 103 1 0 0 0 0 1 0 0 0 1 22 1 1 1 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 11 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 0 0 0 0 27 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 67 117 114 114 101 110 116 95 67 46 73 76 51 2 27 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 67 117 114 114 101 110 116 95 67 46 73 76 51 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 12 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 65 23 0 0 0 65 108 97 114 109 47 119 97 118 101 115 46 87 97 115 115 101 114 115 116 97 110 100 2 23 0 0 0 65 108 97 114 109 46 119 97 118 101 115 46 87 97 115 115 101 114 115 116 97 110 100 1 0 0 0 0 1 0 0 0 1 22 1 1 1 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 13 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 0 0 0 0 23 0 0 0 76 86 47 66 97 121 49 95 49 107 120 122 51 46 49 54 48 65 47 70 117 115 101 2 23 0 0 0 76 86 47 66 97 121 49 95 49 107 120 122 51 46 49 54 48 65 47 70 117 115 101 1 0 0 0 0 1 0 0 0 1 22 1 1 2 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 14 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 0 0 0 0 25 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 83 119 105 116 99 104 2 25 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 83 119 105 116 99 104 1 0 0 0 0 1 0 0 0 1 22 1 1 2 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 15 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 0 0 0 0 27 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 67 117 114 114 101 110 116 95 78 46 73 76 78 2 27 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 67 117 114 114 101 110 116 95 78 46 73 76 78 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 16 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 65 29 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 86 111 108 116 97 103 101 95 65 66 46 85 49 45 50 2 29 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 86 111 108 116 97 103 101 95 65 66 46 85 49 45 50 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 17 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 86 29 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 86 111 108 116 97 103 101 95 66 67 46 85 50 45 51 2 29 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 86 111 108 116 97 103 101 95 66 67 46 85 50 45 51 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 18 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 86 29 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 86 111 108 116 97 103 101 95 67 65 46 85 51 45 49 2 29 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 86 111 108 116 97 103 101 95 67 65 46 85 51 45 49 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 19 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 86 47 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 51 80 104 95 65 99 116 105 118 101 95 80 111 119 101 114 46 51 80 104 97 115 101 110 76 101 105 115 116 117 110 103 80 2 47 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 51 80 104 95 65 99 116 105 118 101 95 80 111 119 101 114 46 51 80 104 97 115 101 110 76 101 105 115 116 117 110 103 80 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 20 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 1 0 0 0 107 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 87 49 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 51 80 104 95 65 112 112 97 114 101 110 116 95 80 111 119 101 114 46 51 80 104 97 115 101 110 76 101 105 115 116 117 110 103 83 2 49 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 51 80 104 95 65 112 112 97 114 101 110 116 95 80 111 119 101 114 46 51 80 104 97 115 101 110 76 101 105 115 116 117 110 103 83 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 21 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 1 0 0 0 107 1 0 4 0 0 0 85 110 105 116 12 2 0 0 0 86 97 49 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 51 80 104 95 82 101 97 99 116 105 118 101 95 80 111 119 101 114 46 51 80 104 97 115 101 110 76 101 105 115 116 117 110 103 81 2 49 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 51 80 104 95 82 101 97 99 116 105 118 101 95 80 111 119 101 114 46 51 80 104 97 115 101 110 76 101 105 115 116 117 110 103 81 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 22 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 1 0 0 0 107 1 0 4 0 0 0 85 110 105 116 12 3 0 0 0 86 97 114 44 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 77 101 97 115 117 114 101 109 101 110 116 46 70 101 114 110 115 101 104 108 97 117 116 115 116 97 101 114 107 101 2 44 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 77 101 97 115 117 114 101 109 101 110 116 46 70 101 114 110 115 101 104 108 97 117 116 115 116 97 101 114 107 101 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 23 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 1 0 0 0 100 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 66 42 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 84 101 109 112 95 70 117 115 101 95 65 46 84 101 109 112 83 105 99 104 101 114 117 110 103 73 76 49 2 42 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 84 101 109 112 95 70 117 115 101 95 65 46 84 101 109 112 83 105 99 104 101 114 117 110 103 73 76 49 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 24 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 67 42 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 84 101 109 112 95 70 117 115 101 95 66 46 84 101 109 112 83 105 99 104 101 114 117 110 103 73 76 50 2 42 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 84 101 109 112 95 70 117 115 101 95 66 46 84 101 109 112 83 105 99 104 101 114 117 110 103 73 76 50 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 25 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 67 42 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 84 101 109 112 95 70 117 115 101 95 67 46 84 101 109 112 83 105 99 104 101 114 117 110 103 73 76 51 2 42 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 84 101 109 112 95 70 117 115 101 95 67 46 84 101 109 112 83 105 99 104 101 114 117 110 103 73 76 51 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 26 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 67 34 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 84 101 109 112 46 66 111 100 101 110 116 101 109 112 101 114 97 116 117 114 2 34 0 0 0 77 86 47 82 49 95 70 49 46 49 50 107 86 47 84 101 109 112 46 66 111 100 101 110 116 101 109 112 101 114 97 116 117 114 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 27 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 67 44 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 84 101 109 112 95 70 117 115 101 95 65 46 84 101 109 112 101 114 97 116 117 114 73 76 49 2 44 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 84 101 109 112 95 70 117 115 101 95 65 46 84 101 109 112 101 114 97 116 117 114 73 76 49 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 28 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 67 44 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 84 101 109 112 95 70 117 115 101 95 66 46 84 101 109 112 101 114 97 116 117 114 73 76 50 2 44 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 84 101 109 112 95 70 117 115 101 95 66 46 84 101 109 112 101 114 97 116 117 114 73 76 50 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 29 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 67 44 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 84 101 109 112 95 70 117 115 101 95 67 46 84 101 109 112 101 114 97 116 117 114 73 76 51 2 44 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 84 101 109 112 95 70 117 115 101 95 67 46 84 101 109 112 101 114 97 116 117 114 73 76 51 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 30 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 67 32 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 67 117 114 114 101 110 116 95 65 46 73 76 49 2 32 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 67 117 114 114 101 110 116 95 65 46 73 76 49 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 31 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 65 32 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 67 117 114 114 101 110 116 95 66 46 73 76 50 2 32 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 67 117 114 114 101 110 116 95 66 46 73 76 50 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 32 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 65 32 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 67 117 114 114 101 110 116 95 67 46 73 76 51 2 32 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 67 117 114 114 101 110 116 95 67 46 73 76 51 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 33 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 65 31 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 86 111 108 116 97 103 101 95 65 46 85 49 2 31 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 86 111 108 116 97 103 101 95 65 46 85 49 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 34 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 86 31 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 86 111 108 116 97 103 101 95 66 46 85 50 2 31 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 86 111 108 116 97 103 101 95 66 46 85 50 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 35 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 86 31 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 86 111 108 116 97 103 101 95 67 46 85 51 2 31 0 0 0 76 86 47 66 97 121 51 95 49 107 120 122 52 46 49 54 48 65 47 86 111 108 116 97 103 101 95 67 46 85 51 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 36 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 86 23 0 0 0 76 86 47 66 117 115 98 97 114 47 67 111 115 80 104 105 46 67 111 115 80 104 105 2 23 0 0 0 76 86 47 66 117 115 98 97 114 47 67 111 115 80 104 105 46 67 111 115 80 104 105 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 37 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 0 0 0 0 23 0 0 0 76 86 47 66 117 115 98 97 114 47 67 117 114 114 101 110 116 95 65 46 73 76 49 2 23 0 0 0 76 86 47 66 117 115 98 97 114 47 67 117 114 114 101 110 116 95 65 46 73 76 49 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 38 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 65 23 0 0 0 76 86 47 66 117 115 98 97 114 47 67 117 114 114 101 110 116 95 66 46 73 76 50 2 23 0 0 0 76 86 47 66 117 115 98 97 114 47 67 117 114 114 101 110 116 95 66 46 73 76 50 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 39 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 65 23 0 0 0 76 86 47 66 117 115 98 97 114 47 67 117 114 114 101 110 116 95 67 46 73 76 51 2 23 0 0 0 76 86 47 66 117 115 98 97 114 47 67 117 114 114 101 110 116 95 67 46 73 76 51 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 40 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 65 40 0 0 0 76 86 47 66 117 115 98 97 114 47 77 101 97 115 117 114 101 109 101 110 116 46 70 101 114 110 115 101 104 108 97 117 116 115 116 97 101 114 107 101 2 39 0 0 0 76 86 47 66 117 115 98 97 114 47 77 101 97 115 117 114 101 109 101 110 116 70 101 114 110 115 101 104 108 97 117 116 115 116 97 101 114 107 101 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 41 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 1 0 0 0 100 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 66 23 0 0 0 76 86 47 66 117 115 98 97 114 47 67 117 114 114 101 110 116 95 78 46 73 76 78 2 23 0 0 0 76 86 47 66 117 115 98 97 114 47 67 117 114 114 101 110 116 95 78 46 73 76 78 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 42 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 65 25 0 0 0 76 86 47 66 117 115 98 97 114 47 86 111 108 116 97 103 101 95 65 78 46 85 49 45 78 2 25 0 0 0 76 86 47 66 117 115 98 97 114 47 86 111 108 116 97 103 101 95 65 78 46 85 49 45 78 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 43 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 86 25 0 0 0 76 86 47 66 117 115 98 97 114 47 86 111 108 116 97 103 101 95 66 78 46 85 50 45 78 2 25 0 0 0 76 86 47 66 117 115 98 97 114 47 86 111 108 116 97 103 101 95 66 78 46 85 50 45 78 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 44 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 86 25 0 0 0 76 86 47 66 117 115 98 97 114 47 86 111 108 116 97 103 101 95 67 78 46 85 51 45 78 2 25 0 0 0 76 86 47 66 117 115 98 97 114 47 86 111 108 116 97 103 101 95 67 78 46 85 51 45 78 1 0 0 0 0 1 0 0 0 1 22 1 1 3 0 255 255 255 255 255 255 255 255 0 0 0 0 71 70 49 56 49 56 49 56 49 56 49 56 232 3 45 0 2 0 0 0 1 0 6 0 0 0 80 114 101 102 105 120 12 0 0 0 0 1 0 4 0 0 0 85 110 105 116 12 1 0 0 0 86 50 95 71 70 49 56 49 56 49 56 49 56 49 56 23 252 100 28 187 36 100 28 187 36 0 0 0 0"
  val delta    = "209 4 45 0 0 0 65 56 48 48 48 95 67 80 56 48 50 120 95 101 115 115 101 110 95 108 97 98 95 67 80 95 56 48 50 49 95 50 95 71 70 49 56 49 56 49 56 49 56 49 56 1 232 3 235 1 160 42 100 28 187 36 100 28 187 36 6 0 0 0 0 0 8 0 128 60 200 197 209 57 213 1 0 1 0 0 0 8 0 128 60 200 197 209 57 213 1 0 2 0 0 0 8 0 128 60 200 197 209 57 213 1 0 3 0 0 0 8 0 128 60 200 197 209 57 213 1 0 6 0 0 0 8 0 128 60 200 197 209 57 213 1 0 7 0 0 0 8 0 128 60 200 197 209 57 213 1 0"
  val keyFrame = "209 4 45 0 0 0 65 56 48 48 48 95 67 80 56 48 50 120 95 101 115 115 101 110 95 108 97 98 95 67 80 95 56 48 50 49 95 50 95 71 70 49 56 49 56 49 56 49 56 49 56 1 232 3 235 1 161 42 100 28 187 36 100 28 187 36 35 0 4 0 0 0 8 0 240 167 43 200 209 57 213 1 158 230 131 63 5 0 0 0 8 0 240 167 43 200 209 57 213 1 158 230 131 63 8 0 0 0 8 0 240 167 43 200 209 57 213 1 219 128 25 67 9 0 0 0 8 0 240 167 43 200 209 57 213 1 182 147 124 67 12 0 0 0 8 0 240 167 43 200 209 57 213 1 253 196 205 66 16 0 0 0 8 0 240 167 43 200 209 57 213 1 180 17 4 67 17 0 0 0 8 0 240 167 43 200 209 57 213 1 10 45 181 65 18 0 0 0 8 0 240 167 43 200 209 57 213 1 207 114 178 65 19 0 0 0 8 0 240 167 43 200 209 57 213 1 142 7 186 65 20 0 0 0 8 0 240 167 43 200 209 57 213 1 151 144 76 65 21 0 0 0 8 0 240 167 43 200 209 57 213 1 82 32 76 65 22 0 0 0 8 0 240 167 43 200 209 57 213 1 36 129 78 65 23 0 0 0 8 0 240 167 43 200 209 57 213 1 185 1 108 62 24 0 0 0 8 0 0 125 51 194 209 57 213 1 25 210 237 65 25 0 0 0 8 0 0 125 51 194 209 57 213 1 253 99 234 65 26 0 0 0 8 0 0 125 51 194 209 57 213 1 14 86 228 65 27 0 0 0 8 0 0 125 51 194 209 57 213 1 216 165 146 65 28 0 0 0 8 0 0 125 51 194 209 57 213 1 228 141 206 65 29 0 0 0 8 0 0 125 51 194 209 57 213 1 7 236 206 65 30 0 0 0 8 0 0 125 51 194 209 57 213 1 223 145 202 65 31 0 0 0 8 0 240 167 43 200 209 57 213 1 80 30 228 66 32 0 0 0 8 0 240 167 43 200 209 57 213 1 240 77 223 66 33 0 0 0 8 0 240 167 43 200 209 57 213 1 156 0 234 66 34 0 0 0 8 0 240 167 43 200 209 57 213 1 148 135 200 67 35 0 0 0 8 0 240 167 43 200 209 57 213 1 49 82 200 67 36 0 0 0 8 0 240 167 43 200 209 57 213 1 108 95 198 67 37 0 0 0 8 0 240 167 43 200 209 57 213 1 158 230 131 63 38 0 0 0 8 0 240 167 43 200 209 57 213 1 224 239 132 67 39 0 0 0 8 0 240 167 43 200 209 57 213 1 135 23 131 67 40 0 0 0 8 0 240 167 43 200 209 57 213 1 9 147 130 67 41 0 0 0 8 0 240 167 43 200 209 57 213 1 67 103 92 62 42 0 0 0 8 0 240 167 43 200 209 57 213 1 89 182 103 60 43 0 0 0 8 0 240 167 43 200 209 57 213 1 113 43 133 67 44 0 0 0 8 0 240 167 43 200 209 57 213 1 34 5 133 67 45 0 0 0 8 0 240 167 43 200 209 57 213 1 109 35 133 67"
  val deltaFrame = "209 4 45 0 0 0 65 56 48 48 48 95 67 80 56 48 50 120 95 101 115 115 101 110 95 108 97 98 95 67 80 95 56 48 50 49 95 50 95 71 70 49 56 49 56 49 56 49 56 49 56 1 232 3 235 1 18 4 100 28 187 36 100 28 187 36 3 0 2 0 0 0 8 0 208 103 206 158 185 56 213 1 1 3 0 0 0 8 0 208 103 206 158 185 56 213 1 2 6 0 0 0 8 0 208 103 206 158 185 56 213 1 1"

  "it" should "pass a dummy test" in {
    val byteVector = deltaFrame.asByteVector
    val Right(networkMsgHeaderAndPos) = NetworkMessageHeaderParser(byteVector)(initParsePosition)
    val (networkMsgHeader, pos1) = networkMsgHeaderAndPos
    // Now parse the DataSetMessage
    val (dataSetMessageHeader, pos2) = DataSetMessageHeaderParser(byteVector)(pos1)
    println(pos1)
  }
}
