//新增数据函数
function addRow() {
    var table = document.getElementById("table");
    var length = table.rows.length;
    //插入行节点
    var newRow = table.insertRow(length);
    //console.log(newRow);

    //插入列节点
    var nameCol = newRow.insertCell(0);
    var phoneCol = newRow.insertCell(1);
    var actionCol = newRow.insertCell(2);

    nameCol.innerHTML = '未命名';
    phoneCol.innerHTML = '无联系方式';
    actionCol.innerHTML = '<button onclick="editRow(this)">编辑</button> <button onclick="deleteRow(this)">删除</button>';

}
 //删除数据函数
 function deleteRow(button) {
        var row = button.parentNode.parentNode;
        row.parentNode.removeChild(row);      
    }
//编辑数据函数    
function editRow(button) {
    var row = button.parentNode.parentNode;
    var nameCol = row.cells[0];
    var phoneCol = row.cells[1];
    
    var inputName = prompt("请输入新的姓名:");
    if (inputName === null) {
        return; // 用户点击取消，退出函数
    }
    var inputPhone = prompt("请输入新的联系方式:");
    if (inputPhone.length != 11) {
        alert("联系方式必须为11位数字,请重新输入。");
        return; // 用户点击取消，退出函数
    }

    nameCol.innerHTML = inputName;
    phoneCol.innerHTML = inputPhone;
}