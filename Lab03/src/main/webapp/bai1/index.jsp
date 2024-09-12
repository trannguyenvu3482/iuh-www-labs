<%--
  Created by IntelliJ IDEA.
  User: trannguyenvu3482
  Date: 12/09/2024
  Time: 09:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bài 1</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <style>

        th {
            color: white;
        }

        label, span {
            color: white;
        }
    </style>
</head>
<body>
    <div class="container p-2 bg-cyan-500">
        <form class="w-full h-full" action="${pageContext.request.contextPath}/bai1-servlet"
              method="get">
            <div class="flex w-full mb-4">
                <div class="w-2/12">
                    <label for="firstName">First name: </label>
                </div>
                <div class="w-6/12 flex gap-2">
                    <input class="border-2 border-grey-800" type="text" id="firstName" name="firstName"
                    >

                    <span>(max 30 characters a-z and A-Z)</span>
                </div>
            </div>
            <div class="flex w-full mb-4">
                <div class="w-2/12">
                    <label for="lastName">Last name: </label>
                </div>
                <div class="w-6/12 flex gap-2">
                    <input class="border-2 border-grey-800" type="text" id="lastName" name="lastName"
                    >

                    <span>(max 30 characters a-z and A-Z)</span>
                </div>
            </div>
            <div class="flex w-full mb-4">
                <div class="w-2/12">
                    <label for="lastName">Day of birth: </label>
                </div>
                <div class="w-6/12 flex">
                    <label for="day"></label>
                    <select class="mr-2" name="day" id="day">
                        <option value="" disabled selected>Day:</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                    </select>
                    <label for="month"></label>
                    <select class="mr-2" name="month" id="month">
                        <option value="" disabled selected>Month:</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                        <option value="10">11</option>
                        <option value="10">12</option>
                    </select>
                    <label for="year"></label>
                    <select name="year" id="year">
                        <option value="" disabled selected>Year:</option>
                        <option value="6">1999</option>
                        <option value="7">2000</option>
                        <option value="8">2001</option>
                        <option value="9">2002</option>
                        <option value="10">2003</option>
                        <option value="10">2004</option>
                    </select>
                </div>
            </div>
            <div class="flex w-full mb-4">
                <div class="w-2/12">
                    <label for="email">Email: </label>
                </div>
                <div class="w-6/12 flex gap-2">
                    <input class="border-2 border-grey-800" type="text" id="email" name="email"
                    >

                </div>
            </div>
            <div class="flex w-full mb-4">
                <div class="w-2/12">
                    <label for="mobile">Mobile number: </label>
                </div>
                <div class="w-6/12 flex gap-2">
                    <input class="border-2 border-grey-800" type="text" id="mobile" name="mobile"
                    >
                    <span>(10 digit number)</span>
                </div>
            </div>
            <div class="flex w-full mb-4">
                <div class="w-2/12">
                    <label>Gender: </label>
                </div>
                <div class="w-6/12 flex">
                    <label for="male">Male</label>
                    <input class="mx-2" type="radio" name="gender" id="male" value="male" checked>
                    <label for="female">Female</label>
                    <input class="ml-2" type="radio" name="gender" id="female" value="female">
                </div>
            </div>
            <div class="flex w-full mb-4">
                <div class="w-2/12">
                    <label for="address">Address: </label>
                </div>
                <div class="w-6/12 flex">
                    <textarea class="border-2 border-grey-800 w-1/2" id="address" name="address"
                    >
                    </textarea>
                </div>
            </div>
            <div class="flex w-full mb-4">
                <div class="w-2/12">
                    <label for="city">City: </label>
                </div>
                <div class="w-6/12 flex gap-2">
                    <input class="border-2 border-grey-800" type="text" id="city" name="city"
                    >

                    <span>(max 30 characters a-z and A-Z)</span>
                </div>
            </div>
            <div class="flex w-full mb-4">
                <div class="w-2/12">
                    <label for="pin">Pin code: </label>
                </div>
                <div class="w-6/12 flex gap-2">
                    <input class="border-2 border-grey-800" type="text" id="pin" name="pin"
                    >

                    <span>(6 digit number)</span>
                </div>
            </div>
            <div class="flex w-full mb-4">
                <div class="w-2/12">
                    <label for="state">State: </label>
                </div>
                <div class="w-6/12 flex gap-2">
                    <input class="border-2 border-grey-800" type="text" id="state" name="state"
                    >

                    <span>(max 30 characters a-z and A-Z)</span>
                </div>
            </div>
            <div class="flex w-full mb-4">
                <div class="w-2/12">
                    <label for="country">Country: </label>
                </div>
                <div class="w-6/12 flex gap-2">
                    <input class="border-2 border-grey-800" type="text" id="country" name="country"
                    >

                    <span>(max 30 characters a-z and A-Z)</span>
                </div>
            </div>
            <div class="flex w-full mb-4">
                <div class="w-2/12">
                    <label>Hobbies: </label>
                </div>
                <div class="w-6/12 flex gap-2 items-center">
                    <label for="drawing">Drawing</label>
                    <input class="mx-2" type="checkbox" name="hobbies" id="drawing" value="drawing">
                    <label for="singing">Singing</label>
                    <input class="ml-2" type="checkbox" name="hobbies" id="singing" value="singing">
                    <label for="dancing">Dancing</label>
                    <input class="ml-2" type="checkbox" name="hobbies" id="dancing" value="dancing">
                    <label for="sketching">Sketching</label>
                    <input class="ml-2" type="checkbox" name="hobbies" id="sketching" value="sketching">
                    <label for="others">Others</label>
                    <input class="ml-2" type="checkbox" name="hobbies" id="others" value="others">
                    <label>
                        <input class="border-2 border-grey-800" type="text" id="others-textbox" name="others"
                        >
                    </label>
                </div>
            </div>
            <div class="flex w-full mb-4">
                <div class="w-2/12">
                    <label for="country">Qualification: </label>
                </div>
                <div class="w-8/12 flex border-2 border-purple-800">
                    <table class="w-full" border="1">
                        <thead>
                            <tr>
                                <th>Sl.No.</th>
                                <th>Examination</th>
                                <th>Board</th>
                                <th>Percentage</th>
                                <th>Year of Passing</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <th>1</th>
                                <th>Class X</th>
                                <td>
                                    <label>
                                        <input class="border-2 border-grey-800 w-full" type="text">
                                    </label>
                                </td>
                                <td>
                                    <label>
                                        <input class="border-2 border-grey-800 w-full" type="text">
                                    </label>
                                </td>
                                <td>
                                    <label>
                                        <input class="border-2 border-grey-800 w-full" type="text">
                                    </label>
                                </td>
                            </tr>
                            <tr>
                                <th>2</th>
                                <th>Class XII</th>
                                <td>
                                    <label>
                                        <input class="border-2 border-grey-800 w-full" type="text">
                                    </label>
                                </td>
                                <td>
                                    <label>
                                        <input class="border-2 border-grey-800 w-full" type="text">
                                    </label>
                                </td>
                                <td>
                                    <label>
                                        <input class="border-2 border-grey-800 w-full" type="text">
                                    </label>
                                </td>
                            </tr>
                            <tr>
                                <th>3</th>
                                <th>Graduation</th>
                                <td>
                                    <label>
                                        <input class="border-2 border-grey-800 w-full" type="text">
                                    </label>
                                </td>
                                <td>
                                    <label>
                                        <input class="border-2 border-grey-800 w-full" type="text">
                                    </label>
                                </td>
                                <td>
                                    <label>
                                        <input class="border-2 border-grey-800 w-full" type="text">
                                    </label>
                                </td>
                            </tr>
                            <tr>
                                <th>4</th>
                                <th>Masters</th>
                                <td>
                                    <label>
                                        <input class="border-2 border-grey-800 w-full" type="text">
                                    </label>
                                </td>
                                <td>
                                    <label>
                                        <input class="border-2 border-grey-800 w-full" type="text">
                                    </label>
                                </td>
                                <td>
                                    <label>
                                        <input class="border-2 border-grey-800 w-full" type="text">
                                    </label>
                                </td>
                            </tr>
                            <tr>
                                <td></td>
                                <td></td>
                                <td class="text-center text-white">(10 chars max)</td>
                                <td class="text-center text-white">(Up to 2 decimal)</td>
                                <td></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            <div class="flex w-full">
                <div class="w-2/12">
                    <label>Course applied for: </label>
                </div>
                <div class="w-6/12 flex">
                    <label for="bca">BCA</label>
                    <input class="mx-2" type="radio" name="course" id="bca" value="bca">
                    <label for="bcom">B.Com</label>
                    <input class="ml-2" type="radio" name="course" id="bcom" value="bcom">
                    <label for="bsc">B.Sc</label>
                    <input class="ml-2" type="radio" name="course" id="bsc" value="bsc">
                    <label for="ba">B.A</label>
                    <input class="ml-2" type="radio" name="course" id="ba" value="ba">
                </div>
            </div>
            <div class="flex w-full justify-center gap-2">
                <input class="px-4 cursor-pointer    bg-gray-300 border" type="submit" value="Submit">
                <button class="px-4 cursor-pointer   bg-gray-300 border">Reset</button>
            </div>
        </form>
    </div>
</body>
</html>
